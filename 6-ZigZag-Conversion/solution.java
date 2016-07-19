public class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 0)
			return "";
		if (numRows == 1)
			return s;
        StringBuilder res = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < numRows; i++){
            int flag=0;
            for (int j=i; j<length;){
                res.append(s.charAt(j));
                if (i == 0 || i == numRows - 1){
                    j = j + 2 * (numRows-1);
                }else{
                    if(flag % 2 == 0){
                        j = j + 2 * (numRows - i -1);
                    }else{
                        j = j + 2 * i;
                    }
                    flag++;
                }
            }
        }
        return res.toString();
    }
}