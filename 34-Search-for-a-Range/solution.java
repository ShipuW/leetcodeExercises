public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int mid = 0;
		int start = 0, end = nums.length - 1;
		int[] index = { -1, -1 };
		boolean flag = true;
		while (start <= end) {
			mid = (start + end) >> 1;
			if (nums[mid] == target) {
				flag = false;
				break;
			}
			if (nums[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}
		
		if(flag)
		    return index;
		int right = mid;
		while (right < nums.length && nums[right] == target)
		    right ++;
		int left = mid;
		while (left >= 0 && nums[left] == target)
		    left --;
		index[0] = left + 1;
		index[1] = right - 1;
		return index;
		   
    }

}