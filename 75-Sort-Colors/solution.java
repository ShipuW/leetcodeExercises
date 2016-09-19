public class Solution {
    public void sortColors(int[] nums) {
        int redpt = 0, bluept = nums.length - 1;
		int i = 0;

		// stop looping when current >= bluept
		while (i <= bluept) {
			// if color is RED, move to the front
			if (nums[i] == 0) {
				swap(nums, redpt, i);//always swap with the first one*****
				redpt++;
				i++;
				continue;
			} else if (nums[i] == 2) { // if color is BLUE, move to the end
				swap(nums, bluept, i);
				bluept--;
				continue;
			} else {
				i++; // if color is WHITE, don't move
			}
		}
    }
    public void swap(int[] A, int from, int to) {
		int tmp = A[from];
		A[from] = A[to];
		A[to] = tmp;
	}
}