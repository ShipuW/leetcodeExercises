import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(2, "abc");
		table.put(3, "def");
		table.put(4, "ghi");
		table.put(5, "jkl");
		table.put(6, "mno");
		table.put(7, "pqrs");
		table.put(8, "tuv");
		table.put(9, "wxyz");
		return letterCombinationsHelper(digits, table);
    }
    
    public List<String> letterCombinationsHelper(String digits, Hashtable<Integer, String> table) {
        List<String> result = new ArrayList<String>();
		if (digits.length() == 0) {
			return result;
		}
		List<String> prev = letterCombinationsHelper(digits.substring(1), table);
		if(prev.size() == 0){//deal with (""->[]) case
		    prev.add("");
		}
		int num = digits.charAt(0) - '0';
		
		String str = table.get(num);
		for(int i = 0; i < str.length(); i++){
		    for (int j = 0; j < prev.size(); j++) {
				result.add(str.charAt(i) + prev.get(j));
			}
		}
        return result;
    }
		
}