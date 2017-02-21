/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/
----------------------------------------------------------------------------------------------------------------
public class Solution {
    public String reverseString(String s) {
        if(s ==null || s.length()==0 || s.isEmpty()){
            return "";
        }
        char[] str = s.toCharArray();
        int len = s.length();
        
        for(int i=0;i<len/2;i++){
            char temp = str[i];
            str[i] = str[len-i-1];
            str[len-i-1] = temp;
            
        }
        return new String(str);
    }
}
