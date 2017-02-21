/*
Description:

Count the number of prime numbers less than a non-negative number, n.
*/
--------------------------------------------------------------------------------
public class Solution {
    public int countPrimes(int n) {
        boolean[] sieve = new boolean[n+1];
        
        for(int i=2;i<n;i++){
            sieve[i] = true;
        }
        
        for(int i=2;i*i<=n;i++){
            if(sieve[i]){
                for(int j=i;i*j<=n;j++)
                {
                    sieve[i*j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(sieve[i]){
                count++;
            }
        }
        return count;
    }
}
