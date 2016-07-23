public class Solution {
    //TLE case: -2147483648
    // -1
    // use << to speed up
    public int divide(int dividend, int divisor) {
        
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        
        long ret = 0;
        //从小到大减
        while (a >= b) {
            for (long tmp = b, cnt = 1; a >= tmp; tmp <<= 1, cnt <<= 1) {
                ret += cnt;
                a -= tmp;
            }
        }
        //从大到小减
        /*
        while (true) {
            if ((divisorL << move) > dividendL) { // found the highest digit
                break;
            }
 
            move++;
 
        } // while
 
        long temp = dividendL;
        for (int i = move - 1; i >= 0; i--) {
            long newDivisor = divisorL << i;
            if (temp - newDivisor < 0)
                continue;
 
            temp -= newDivisor;
            if (i == 0)
                res += 1;
            else
                res += 2 << (i - 1);
        }
        */
        
        ret = (((dividend ^ divisor) >> 31) & 1) == 1 ? -ret: ret;//deal with out of range case 32位为符号位
        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
            
        return (int)ret;
    }
}