public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<List<String>>();
        if (strs.length == 0||strs==null)
			return res;
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String tempStr = new String(chars);
            if (map.containsKey(tempStr)) {
				map.get(tempStr).add(s);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(s);
				map.put(tempStr, list);
			}
        }
        for(String str:map.keySet()){
            if (map.get(str).size() > 0) {
				List<String> temp = new ArrayList<String>();
				for (String s : map.get(str))
					temp.add(s);
				res.add(temp);
			}
        }
        return res;
    }
}