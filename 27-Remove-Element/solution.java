public class Solution {
    public int removeElement(int[] nums, int val) {
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end){
            if (nums[begin] != val){
                begin ++;
            }else if(nums[end] == val){
                end --;
            }else{
                nums[begin++] = nums[end--];
            }
            
        }
        return begin;
    }
}