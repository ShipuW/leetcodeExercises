public class Solution {
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder("");
        for (int i = s.length(); i > 0; i--){
            result.append(s.charAt(i-1));
        }
        return result.toString();
    }
}