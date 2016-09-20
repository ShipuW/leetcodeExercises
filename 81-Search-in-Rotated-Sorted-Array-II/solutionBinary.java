public class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
		while (start <= end) {
			if(start == end){
			    return nums[start]==target;
			}else{
			    int mid = (start + end) >> 1;
			    if(nums[mid]==target||nums[start]==target||nums[end]==target) return true;
			 //   if((target - nums[mid])*(target-nums[end])*(nums[mid]-nums[end])<0){
			 //       end = mid - 1;
			 //   }else if((target - nums[mid])*(target-nums[end])*(nums[mid]-nums[end])>0){
			 //       start = mid + 1;
			 //   }else{
			 //       start++;//important for this case [1,3,1,1,1] 3
			 //   }
			    if (nums[mid] > nums[start]) {
				    if (nums[start] <= target && target < nums[mid])
    					end = mid - 1;
    				else
    					start = mid + 1;
    			} else if (nums[mid] < nums[start]) {
    				if (nums[mid] < target && target <= nums[end])
    					start = mid + 1;
    				else
    					end = mid - 1;
    			} else if (nums[mid] == nums[start]) {
    				start++;
    			}
			}
		}
		return false;
	}

}