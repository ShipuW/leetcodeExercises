public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)return nums.length;
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            if(res==0 || nums[i]!=nums[res-1]){
                nums[res++]=nums[i];
            }
            
        }
        return res;
    }
}