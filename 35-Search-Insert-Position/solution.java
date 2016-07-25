public class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int start = 0;
        int end = nums.length - 1;
        
        
        while (start <= end){
            mid = (start + end) >> 1;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid + 1;
            else 
                end = mid - 1;
        }
        if (nums[mid] > target)//notice the boundary. If search goes the left most position. 
			return mid;
		else
			return mid + 1;

    }
}