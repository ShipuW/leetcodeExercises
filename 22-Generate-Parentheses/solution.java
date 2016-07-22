public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
		String str = "";
		generateParenthesis(0, 0, n, str, list);
		return list;
    }
    public void generateParenthesis(int left, int right, int n, String str,List<String> list) {
		if(left + right == 2 * n){
		    list.add(str);
		}
		if(left < n){
		    generateParenthesis(left + 1, right, n, str + "(", list);
		}
		if(left>right){
		    generateParenthesis(left, right + 1, n, str + ")", list);
		}
	}
}