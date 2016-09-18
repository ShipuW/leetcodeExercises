public class Solution {
    public int mySqrt(int x) {
        int i = 0;
        int j = x/2+1;//在[0, n/2+1]这个范围内可以进行二分搜索，求出n的平方根。
        while(i<=j){
            int mid = (i + j)/2;
            long square = (long) mid * mid;//大数处理
            if(square == x)
                return mid;
            else if(square < x)
                i = mid + 1;
            else
                j = mid -1;
        }
        return j;
    }
}