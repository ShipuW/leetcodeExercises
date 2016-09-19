public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		combineHelper(n, 1, k, list, res);
		return res;
    }
    public void combineHelper(int n, int start, int k, List<Integer> list, List<List<Integer>> res){
        if(list.size()==k) {
            res.add(new ArrayList<Integer>(list));//直接用list加不进去


            return;
        }
        for(int i = start; i <= n; i++){
            list.add(i);
            combineHelper(n, i+1, k, list, res);
            list.remove(list.size() - 1);//加过之后得减掉 
        }
    }
}