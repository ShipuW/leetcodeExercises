public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return res;
        //res.add(new ArrayList<Integer>(nums[0]));
        List<Integer> l0 = new ArrayList<Integer>();
        l0.add(nums[0]);
        res.add(l0);
        
        for(int i = 1; i < nums.length; i++){
            List<List<Integer>> res_new = new ArrayList<List<Integer>>();
            for(int j = 0; j <= i; j++){
                for(List<Integer> list : res){
                    List<Integer> list_new = new ArrayList<Integer>(list);//不声明新的list则改变原有list
                    
                    list_new.add(j,nums[i]);
                    if(!res_new.contains(list_new))
                        res_new.add(list_new);
                }
            }
            res = res_new;
        }
        
        return res;
        
    }
}