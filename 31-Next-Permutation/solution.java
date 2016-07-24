public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1)
			return;
        int size = nums.length;
        
        
        for (int i = size - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                int j ;
                for (j = size - 1; j >= i; j--)
                    if (nums[i] < nums[j])
                        break;
                swap(nums,i,j);
                
                Arrays.sort(nums,i+1,size);
                return;
            }
        }
        //reverse the whole array
        for (int i = 0; i < size / 2; i++) {
			swap(nums, i, size-1-i);
		}
		return;
    }
    
    private static void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;		
	}
}