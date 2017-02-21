/*
Implement int sqrt(int x).

Compute and return the square root of x.
*/
----------------------------------------------------------------------------------------
public class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        long low = 0;
        long high =  x/2;
        long ans = 0;
        while(low <= high){
            long mid = (low + high)/2;
            //x is perfect square
            if(mid * mid  == x){
                return (int)mid;
            }
            // Since we need floor, we update answer when mid*mid is
	        // smaller than x, and move closer to sqrt(x)
            if(mid * mid < x){
                low = mid + 1;
                ans = mid;
            }else{
                // If mid*mid is greater than x
                high = mid - 1;
            }
        }
        return (int)ans;
    }
}
//log(x)
//http://www.geeksforgeeks.org/square-root-of-an-integer/
//http://www.lifeincode.net/programming/leetcode-sqrtx-java/
