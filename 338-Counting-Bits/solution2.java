// Num:0 1 | 2 3 |4 5 6 7 |8 9 10 11 12 13 14 15 |16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 |
// Bits0 1   1 2  1 2 2 3  1 2 2  3   2  3  3  4 |1  2  2  3  2  3  3  4  2  3  3  4  3  4   4  5

public class Solution {
    public int[] countBits(int num) {
		int res[] = new int[num+1];
		res[0]=0;
		if(num==0)
			return res;
		res[1]=1;
		int cur=2;
		while(cur<=num){
			int index=cur/2;
			int begin=cur;
			while(index<begin&&cur<=num){
				res[cur]=res[index];
				index++;
				cur++;
			}
			index=begin;
			while(cur<begin*2&&cur<=num){
				res[cur]=res[index]+1;
				index++;
				cur++;
			}
		}
		return res;
	}
}