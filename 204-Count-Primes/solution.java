public class Solution {
    public int countPrimes(int n) {

        boolean[] isPrime=new boolean[n];
		Arrays.fill(isPrime, true);
        /*for(int i = 2; i < n; i ++){
            for(int j = 2; j * j <= i; j++){
                if(isPrime[j]){
                    if(i % j == 0){
                        isPrime[i] = false;
                        break;
                    }
                }
            }
        }*/
        for (int i = 2; i < Math.sqrt(n); i++) {
			if (isPrime[i]) {
				for (int j = 2 * i; j < n; j += i)
					isPrime[j] = false;
			}
		}

        int res = 0;
        for(int i = 2; i < n; i++){
            res = isPrime[i] == true ? res+1 : res;
        }
        return res;
    }
}