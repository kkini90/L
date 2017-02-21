/*
Determine whether an integer is a palindrome. Do this without extra space.
*/
------------------------------------------------------------------------------------------
public class Solution {
    public boolean isPalindrome(int num) {
        int reverse=0;
        int x = num;
        int rem;
        boolean flag = false;
        
       
        if(x<0){
            flag = true;
        }
        while(x>0){
            rem = x%10;
            reverse = reverse*10 + rem;
            x=x/10;
        }
        
        if(flag){
            reverse = -reverse;
        }
        
        if(reverse != num){
            return false;
        }
        return true;
    }
}
