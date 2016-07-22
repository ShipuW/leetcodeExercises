public class Solution {
    //TLE case: -2147483648
    // -1
    public int divide(int dividend, int divisor) {
        if (divisor == 0)return Integer.MAX_VALUE;
        
        long absa = Math.abs((long)dividend);
        long absb = Math.abs((long)divisor);
        long res = 0;
        long sum = 0;
        while (sum <= absa){
            sum += absb;
            res ++;
        }
        res--;
        if ((dividend < 0 && divisor < 0) || (dividend >= 0 && divisor >= 0))
            return (int) res;
        else 
            return -(int) res;
    }
}