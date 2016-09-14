public class Solution {
    public int maxSubArray(int[] nums) {
        return divide(nums, 0, nums.length-1);
    }
    
    public int divide(int[] nums, int left, int right){
        if (left == right)
			return nums[left];
		if (left == right - 1)
			return Math.max(nums[left] + nums[right], Math.max(nums[left], nums[right]));
		int mid = (left + right) / 2;
		int lmax = divide(nums, left, mid - 1);
		int rmax = divide(nums, mid + 1, right);
		int mmax = nums[mid];
		int tmp = mmax;
		
		for(int i = mid - 1; i >= left; i --){
		    tmp += nums[i];
			if (tmp > mmax)
				mmax = tmp;
		    //mmax = Math.max(mmax+nums[i],mmax);//gap add occurs using this sentence
		}
		tmp = mmax;
		for(int i = mid + 1; i <= right; i ++){
		    tmp += nums[i];
			if (tmp > mmax)
				mmax = tmp;
		    //mmax = Math.max(mmax+nums[i],mmax);
		}
		
		return Math.max(mmax, Math.max(lmax, rmax));
        
    }
}