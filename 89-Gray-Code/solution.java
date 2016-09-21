public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        /* 镜射排列
         * n位元的格雷码可以从n-1位元的格雷码以上下镜射后加上新位元的方式快速的得到
         */
        
        if (n == 0) {
            ArrayList<Integer> res = new ArrayList<Integer>();
			res.add(0);
			return res;
		}
        ArrayList<Integer> tmp = grayCode(n-1);
	    int addNumber = 1 << (n-1);
	    ArrayList<Integer> res = new ArrayList<Integer>(tmp);
	    for(int i=tmp.size()-1;i>=0;i--) {
	        res.add(addNumber + tmp.get(i));
	    }
	    return res;
    }
    
}