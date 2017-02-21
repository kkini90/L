/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
*/
----------------------------------------------------------------------------------------
public class Solution {
    public int reverse(int x) {
        boolean flag = false;
        int remainder = 0;
        long reverse=0;
        if(x < 0){
            x = -x;
            flag = true;
            
        }
        while(x>0){
            remainder = x%10;
            reverse = reverse*10 + remainder;
            x=x/10;
        }
        if(flag){
             reverse = -reverse;
        }
        
        return reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ? 0: (int) reverse;

    }
}
