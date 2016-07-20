public class Solution {
    public String longestPalindrome(String s) {
        String maxSubstring,curSubstring;
        maxSubstring = "";
        curSubstring = "";
        for(int i = 0; i < s.length() ; i++){//2n-1 centers
            
            if(i!=0){
                curSubstring = isPalindromeCenter(s,i-1,i);
                if (curSubstring.length()>maxSubstring.length()){
                    maxSubstring = curSubstring;
                }
            }
            
            curSubstring = isPalindromeCenter(s,i,i);
            if (curSubstring.length()>maxSubstring.length()){
                maxSubstring = curSubstring;
            }
            
            
        }
        return maxSubstring;
        
    }
    
    
    public String isPalindromeCenter(String s, int begin, int end){
        while(true){
            if(begin < 0 || end > s.length()-1){//notice the boundary
                break;
            }else if(s.charAt(begin) != s.charAt(end)){
                break;
            }else{
                begin--;
                end++;
            }
        }
        
        return s.substring(begin+1,end+1-1);
    }
}