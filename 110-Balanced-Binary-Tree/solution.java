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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return isBalanced(root.left)&&isBalanced(root.right)&&Math.abs(height(root.left)-height(root.right))<=1;
        
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return (height(root.left)>height(root.right)?height(root.left):height(root.right))+1;
    }
}