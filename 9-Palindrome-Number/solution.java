public class Solution {
    public boolean isPalindrome(int x) {
        
        if (x<0) return false;
        int ox = x;//extra space?
        /*public boolean isPalindrome(int x) {
		    if (x < 0)
			    return false;
		    return reverse(x) == x;
    	}*/
        long result = 0; 
        while(true){
            result = result * 10 + x % 10;
            x /= 10;
            if(x == 0)break;

        }

        if (result == ox)return true;
        else return false;

    }
}