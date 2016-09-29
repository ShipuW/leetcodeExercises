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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return areSymmetric(root.left,root.right);
    }
    public boolean areSymmetric(TreeNode left, TreeNode right){
        if(left == null&&right == null) return true;
        if (left != null && right != null) {
			if (left.val != right.val)//need 判断当前 value
				return false;
			return areSymmetric(left.left, right.right) && areSymmetric(left.right, right.left);
		} else
			return false;
        
    }
}