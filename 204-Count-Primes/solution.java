public class Solution {
    public int countPrimes(int n) {

        boolean[] isPrime=new boolean[n];
		Arrays.fill(isPrime, true);
        for(int i = 2; i < n; i ++){
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(isPrime[j]){
                    if(i % j == 0){
                        isPrime[i] = false;
                        break;
                    }
                }
            }
        }
        int res = 0;
        for(int i = 2; i < n; i++){
            res = isPrime[i] == true ? res+1 : res;
        }
        return res;
    }
}