public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";    
        else return longestCommonPrefix(strs, 0 , strs.length - 1);
    }
    
    private String longestCommonPrefix(String[] strs, int l, int r) { //use pointer rather than use extra space
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = (l + r)/2;
            String lcpLeft =   longestCommonPrefix(strs, l , mid);
            String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
            return commonPrefix(lcpLeft, lcpRight);
       }
    }

    public String commonPrefix(String s1, String s2){
        String result = "";
        int min = Math.min(s1.length(), s2.length());       
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                // if (i == 0) return "";
                // else
                    result = s1.substring(0,i);
                    return result;//need return....
            }
        }
        result = s1.substring(0,min);//notice this
        return result;
    }
    

}