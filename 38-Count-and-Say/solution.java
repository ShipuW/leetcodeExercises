public class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String preRes = countAndSay(n - 1);
        StringBuffer res = new StringBuffer();
        char preN = preRes.charAt(0);
        int count = 0;
        for(int i = 0; i < preRes.length(); i++){
            if(preN == preRes.charAt(i)){
                count ++;
            }else{
                res.append(count).append(preN);
                preN = preRes.charAt(i);
                count = 1;
            }
        }
        res.append(count).append(preN);
        return res.toString();
    }
}