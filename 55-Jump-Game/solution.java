public class Solution {
    public boolean canJump(int[] nums) {
        int rightBound = 0;
        
        for(int i = 0; i <= rightBound; i++){
            if(i+nums[i] > rightBound)
                rightBound = i + nums[i];
            if(rightBound >= nums.length - 1)
                return true;
        }
        return false;
    }

}