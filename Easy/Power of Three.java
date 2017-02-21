/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        
        double val = Math.log10(n) / Math.log10(3);
        return (n==1 || Math.floor(val) == val);
    }
}
