public class Solution {
    public int climbStairs(int n) {
        if(n == 1)return 1;
        int[] res = new int[n];
        res[n-1] = 1;
        res[n-2] = 2;
        for(int i = n - 3; i>=0; i--){
            res[i] = res[i+1]+res[i+2];
        }

        return res[0];
    }
}