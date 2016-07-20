import java.util.*;

public class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

		if(nums.length<3)
			return res;
			
		Arrays.sort(nums);
		
        for(int i = 0;i<nums.length - 2;i++){
            if (i == 0 || nums[i] != nums[i - 1]) {//*remove duplicate triplets!
                int lp = i + 1;
                int rp = nums.length - 1;
                while (lp < rp){
                    if ( nums[lp] + nums[rp] ==  - nums[i]){
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
    					list.add(nums[lp]);
    					list.add(nums[rp]);
    					res.add(list);
    					lp ++;
    					rp --;
    
    					while (lp < rp && nums[rp] == nums[rp + 1]){//remove duplicate triplets
    							rp--;
    					}
    					while (lp < rp && nums[lp] == nums[lp - 1]){
    							lp++;
    					}
                    }else if(nums[lp] + nums[rp] < 0 - nums[i]){
                        lp ++;
                    }else{
                        rp --;
                    }
                    
                }
                
            }
        }
        return res;
    }

    
}