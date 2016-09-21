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
    public boolean isValidBST(TreeNode root) {
        if(root == null)return true;
        if(isValidBST(root.left)&&isValidBST(root.right)){
            if(root.left!=null)
                if(max(root.left)>=root.val)//?[1,1] false
                    return false;
            
            if(root.right!=null)
                if(min(root.right)<=root.val)
                    return false;
        
            return true;
        }else{
            return false;
        }
    }
    public int max(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(Math.max(max(root.left),max(root.right)),root.val);
    }
    public int min(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(Math.min(min(root.left),min(root.right)),root.val);
    }
}