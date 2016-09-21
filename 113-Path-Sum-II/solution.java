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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        List<Integer> list = new ArrayList<Integer>();

        pathSumHelper(root, sum, res, list);
        return res;
    }
    public void pathSumHelper(TreeNode root, int sum, List<List<Integer>> res, List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null && root.val == sum){
            list.add(root.val);
            res.add(new ArrayList<Integer>(list));//list is reference!!!
            list.remove(list.size()-1);
        }else{
            list.add(root.val);
            pathSumHelper(root.left, sum - root.val, res, list);
            pathSumHelper(root.right, sum - root.val, res, list);
            list.remove(list.size()-1);
        }
        return;
    }
}