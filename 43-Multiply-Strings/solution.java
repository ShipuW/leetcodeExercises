public class Solution {
    public String multiply(String num1, String num2) {
         int[] d = new int[num1.length() + num2.length()];
         for(int i = num1.length(); i > 0; i--){
             int a = num1.charAt(i - 1) - '0';
             for(int j = num2.length(); j > 0; j--){
                 int b = num2.charAt(j - 1) - '0';
                 int res = a * b;
                 d[num1.length() + num2.length() - (num1.length() - i) - (num2.length() - j) - 1] += res;
             }
         }
         StringBuilder sb = new StringBuilder();
         int carry = 0;
         for(int i = num1.length() + num2.length(); i > 0; i--){
             sb.insert(0,(d[i - 1]+carry)%10);
             carry = (d[i - 1]+carry)/10;
         }
         while (sb.length() > 0 && sb.charAt(0) == '0') {
	        sb.deleteCharAt(0);
	     }
	     return sb.length() == 0 ? "0" : sb.toString();
    }
}