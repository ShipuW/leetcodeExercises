public class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder("");
        int[] int_dict = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] roman_dict = { "M", "CM", "D", "CD", "C", "XC", "L", "XL","X", "IX", "V", "IV", "I" };
		for(int i = 0; i < int_dict.length; i++){
		    int t = num / int_dict[i];
		    for(int j = 0; j < t; j++){
		        result.append(roman_dict[i]);
		    }
		    num = num % int_dict[i];
		}
		return result.toString();
    }
}