import java.util.Map;
import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int prev=0,sum=0;
		for(char c:s.toCharArray()){
		    int curr = map.get(c);
		    sum += (curr > prev) ? (curr - 2 * prev) : curr;//前比后小则减
		    prev = curr;
		}
		return sum;
    }
}