/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<TreeNode>();
        return generateTreesHelper(1,n);
        
    }
    public ArrayList<TreeNode> generateTreesHelper(int start, int end){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		if (start > end) {
			list.add(null);
			return list;
		}

        for(int i = start; i < end+1; i++){//!!end(+1)
            ArrayList<TreeNode> left = generateTreesHelper(start, i-1);
            ArrayList<TreeNode> right = generateTreesHelper(i+1, end);
            
            for (TreeNode l : left) {
				for (TreeNode r : right) {
					TreeNode node = new TreeNode(i);
					node.left = l;
					node.right = r;
					list.add(node);
				}
			}
        }
        return list;
    }
}