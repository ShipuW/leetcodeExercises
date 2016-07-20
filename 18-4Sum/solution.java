import java.util.*;
//another method use pair
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
		if(nums.length<4)
			return res;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 3; i++){
		    if (i == 0 || nums[i] != nums[i - 1])
    		    for(int j = i + 1; j < nums.length - 2; j++){
    		        if (j == i + 1 || nums[j] != nums[j - 1]){
        		        int lp = j + 1;
        		        int rp = nums.length - 1;
        		        while(lp < rp){
        		            if(nums[lp] + nums[rp] == target - nums[i] - nums[j]){
        		                ArrayList<Integer> list = new ArrayList<Integer>();
        		                list.add(nums[i]);
        		                list.add(nums[j]);
        		                list.add(nums[lp]);
        		                list.add(nums[rp]);
        		                res.add(list);
        		                lp ++;
        		                rp --;
        		                while(lp<rp && nums[rp] == nums[rp+1])
        		                    rp --;
        		                while(lp<rp && nums[lp] == nums[lp-1])
        		                    lp ++;
        		            }else if(nums[lp] + nums[rp] < target - nums[i] - nums[j]){
        		                lp ++;
        		            }else{
        		                rp --;
        		            }
        		        }
    		        }
    		    }
		}
		return res;
    }
}