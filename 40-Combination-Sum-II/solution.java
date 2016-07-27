public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (candidates == null || candidates.length == 0)
			return res;
		Arrays.sort(candidates);
		
        ArrayList<Integer> curList = new ArrayList<Integer>();
        
        helper(candidates,target,0,0,res,curList);
        return res;
    }
    
    public void helper(int[] candidates, int target, int start, int curSum, List<List<Integer>> res, ArrayList<Integer> curList){//use start in case of duplication
        if(start>=candidates.length)
            return;
        for(int i = start; i < candidates.length; i++){
            if (i > start && candidates[i] == candidates[i - 1])//need this conditional statement
				continue;
				
            if(candidates[i] + curSum == target){
                curList.add(candidates[i]);
                res.add(curList);
                return;
            }else if(candidates[i] + curSum < target){
                
                ArrayList<Integer> nextList = new ArrayList<Integer>(curList);
                nextList.add(candidates[i]);
                // curSum += candidates[i];
                int nextSum = curSum;
                nextSum += candidates[i];
                helper(candidates,target,i+1,nextSum,res,nextList);
                
            }else{
                continue;
            }
        }
        return;
    }

}