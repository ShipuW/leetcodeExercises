public class Solution {
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();
        if(haystack == null || needle == null || hl < nl)
            return -1;
        
        for(int i = 0; i < hl - nl + 1; i++){
            // if(haystack.substring(i,i+nl) == needle)//?why it cannot cal?
            //     return i;
            boolean successFlag = true;
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					successFlag = false;
					break;
				}
			}
			if (successFlag)
				return i;
        }
        return -1;
    }
}