public class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 0;
        int temp = 0;
        carry = (digits[digits.length - 1] + 1)/10;
        digits[digits.length - 1] = (digits[digits.length - 1] + 1)%10;
        
        for(int i = digits.length - 2; i >= 0; i--){
            temp = carry;
            carry = (digits[i] + carry)/10;
            digits[i] = (digits[i] + temp)%10;
        }
        
        if(carry == 1){
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            for(int i = 0; i < digits.length; i++)
                ans[i+1]=digits[i];
            return ans;
        }else{
            return digits;
        }
    }
}