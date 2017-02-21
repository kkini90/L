/*
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
*/
--------------------------------------------------------------------------------
public class Solution {
    public int trailingZeroes(int n) {
        if(n < 0){
            return -1;
        }
        int count =0;
        for(long i=5; n/i>0; i=i*5){
            count+=n/i;
        }
        return count;
    }
}
//Time complexity : log(n)
