public class Solution {
    public String addBinary(String a, String b) {
        
        if (a == null || a.length() == 0)
			return b;
		if (b == null || b.length() == 0)
			return a;
		int carry = 0;
        int al = a.length()-1;
        int bl = b.length()-1;
        StringBuilder res = new StringBuilder();
        while(al>=0&&bl>=0){
            int digit = char2Int(a.charAt(al)) + char2Int(b.charAt(bl)) + carry;
            carry = digit/2;
            digit %= 2;
            res.insert(0, int2Char(digit));
            al--;
            bl--;
        }
        while(al>=0){
            int digit = char2Int(a.charAt(al)) + carry;
            carry = digit/2;
            digit %= 2;
            res.insert(0, int2Char(digit));
            al--;
        }
        while(bl>=0){
            int digit = char2Int(b.charAt(bl)) + carry;
            carry = digit/2;
            digit %= 2;
            res.insert(0, int2Char(digit));
            bl--;
        }
        if(carry > 0){
            res.insert(0, int2Char(carry));
        }
        return res.toString();
        
    }
    public int char2Int(char c){
        return (int)c-'0';
    }
    public String int2Char(int i){
        return String.valueOf(i);
    }
}