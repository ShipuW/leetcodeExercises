import java.util.Hashtable;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result, max;
        max = 0;
        for(int i = 0; i < s.length(); i++){
            Hashtable<Character,Integer> curtable = new Hashtable<Character,Integer>();
            result = 0;
            for (int j = i; j < s.length(); j++){
                if(curtable.containsKey(s.charAt(j))) break;
                else{
                    curtable.put(s.charAt(j),j);
                    result ++;
                }
            }
            if(result > max){
                max = result;
            }
        }
        return max;
    }
}