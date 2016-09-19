public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        
        List<Integer> list = new ArrayList<Integer>();
        res.add(new ArrayList<Integer>(list));
        subsetsHelper(nums, 0, list, res);
        
        return res;
        
        
    }
    public void subsetsHelper(int[] nums, int start, List<Integer> list, List<List<Integer>> res){

        for(int i = start; i < nums.length; i++){
            List<Integer> tlist = new ArrayList<Integer>(list);
            tlist.add(nums[i]);
            res.add(new ArrayList<Integer>(tlist));
            subsetsHelper(nums, i + 1, tlist, res);
        }
    }
}