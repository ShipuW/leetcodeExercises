/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {//use queue accomplish bfs
/*
public class BinaryTreeLevelOrderTraversa2 {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root==null)
			return res;
		ArrayList<Integer> currlayer = new ArrayList<Integer>();
		queue.add(root);
		queue.add(null);
		currlayer.add(root.val);
		res.add(currlayer);
		// null is used for seperate each level
		while (queue.isEmpty() != false) {
			TreeNode node = queue.poll();
			if (node != null) {
				currlayer.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			} else {
				if (queue.isEmpty())
					break;
				res.add(currlayer);
				currlayer = new ArrayList<Integer>();
				queue.add(null);
			}
		}
		return res;
	}
}

*/
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null)
			return res;
		List<TreeNode> currlayer = new ArrayList<TreeNode>();
		currlayer.add(root);
		while (true) {
			if (currlayer.isEmpty())
				break;
			ArrayList<TreeNode> nextlayer = new ArrayList<TreeNode>();
			ArrayList<Integer> currValue = new ArrayList<Integer>();
			for (TreeNode node : currlayer) {
				currValue.add(node.val);
				if (node.left != null) {
					nextlayer.add(node.left);
				}
				if (node.right != null) {
					nextlayer.add(node.right);
				}
			}
			res.add(currValue);
			currlayer = nextlayer;
		}
		return res;
    }
    
}