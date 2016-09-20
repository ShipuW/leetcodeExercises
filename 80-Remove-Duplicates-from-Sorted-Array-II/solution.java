public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int i = 0;
        int j = 0;
        int flag = 0;
        while(j < nums.length - 1){
            
            if(nums[j+1]==nums[j]){
                if(flag == 0){
                    flag ++;
                    swap(nums, i, j);
                    i++;
                    j++;
                }else{
                    j++;
                }
            }else{
                swap(nums, i, j);
                i++;
                j++;
                flag = 0;
            }
        }
        if(flag <= 1) {
            swap(nums, i, j);
            i++;
        }
        
        return i;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}