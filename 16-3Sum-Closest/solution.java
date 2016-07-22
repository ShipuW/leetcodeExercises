public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
        int res=0;
        int min=Integer.MAX_VALUE;
        //min = Math.abs(nums[0]+nums[1]+nums[2]-target);
        for (int i = 0; i < nums.length; i++){
            int lp = i + 1;
            int rp = nums.length - 1;
            while (lp < rp){
                int sum = nums[i]+nums[lp]+nums[rp];
                int cur = Math.abs(sum-target);
                if (cur < min) {
                    min = cur;
                    res = sum;
                }
                if (sum <= target)
                    lp++;
                else
                    rp--;
            }
        }
        return res;
    }
}