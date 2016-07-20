public class Solution {
    public int reverse(int x) {
        //int absx = Math.abs(x);
        //int temp = 0;
        long result = 0; 
        while(true){
            result = result * 10 + x % 10;
            x /= 10;
            if(x == 0)break;
            // temp = absx % (int)Math.pow(10,i+1) / (int)Math.pow(10,i);
            //temp = temp / (int)Math.pow(10,i);//TLE
            // result = result * 10 + temp;
            // if(absx / (int)Math.pow(10,i+1) == 0) break;
        }
        //if (absx != x ) result = -result;
        
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) //the reverse of int may overflows
                return 0;

        return (int)result;  
    }
}