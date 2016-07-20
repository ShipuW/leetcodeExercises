public class Solution {
    public int maxArea(int[] height) {
        int len = height.length, low = 0, high = len - 1;
		int maxArea = 0;
		while (low < high) {
			maxArea = Math.max(maxArea, (high - low) * Math.min(height[low], height[high]));
			if (height[low] < height[high]) {
			    int l = low;
			    //while(l<high&&height[l]<height[low])//lines on the left cannot be taller than the left of the target area
			    l++;
				low = l;
			} else {
			    int h = high;
			    //while(h>low&&height[h]<height[high])
			    h--;
				high = h;
			}
		}
		return maxArea;
    }
}