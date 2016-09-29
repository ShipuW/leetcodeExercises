public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        if (s.length()<4||s.length()>12) return res;  
        restoreIpAddressesHelper(s,0,"",res);
        return res;
    }
    public void restoreIpAddressesHelper(String s, int point,String cur, List<String> res){
        if(point == 3 && isValid(s)){ 
            res.add(cur+s);
            return;
        }
        for(int i = 1; i < 4 && i < s.length();i++){
            String subStr = s.substring(0,i);
            if(isValid(subStr)){
                restoreIpAddressesHelper(s.substring(i),point+1,cur + subStr + '.', res);
            }
        }
        
    }
    public boolean isValid(String s){  
        if (s.charAt(0)=='0') return s.equals("0");  
        int num = Integer.parseInt(s);  
        return num<=255 && num>0;  
    }  
}