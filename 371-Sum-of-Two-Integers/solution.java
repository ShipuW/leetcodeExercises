public class Solution {
    public int getSum(int a, int b) {
        int res = a ^ b;
        int carry = (a & b)<<1;
        
        while(carry != 0){
            int res_t = carry ^ res;
            carry = (res & carry)<<1;//res已经改变
            res = res_t;
        }
        return res;
    }
}