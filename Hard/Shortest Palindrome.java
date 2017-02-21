/*
Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it. 
Find and return the shortest palindrome you can find by performing this transformation.
For example:
Given "aacecaaa", return "aaacecaaa".
Given "abcd", return "dcbabcd".
*/
------------------------------------------------------------------------------------------
public class Solution {
    public String shortestPalindrome(String s) {
        if( s== null || s.isEmpty()){
            return s;
        }
        int j = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == s.charAt(j)){
                j+=1;
            }
        }
        if(j == s.length()){
            return s;
        }
        String suffix = s.substring(j);
        return new StringBuilder(suffix).reverse().toString() + shortestPalindrome(s.substring(0,j)) + suffix;
    }
}
//eg : s= "abcd"
/*
The idea is to use two anchors j and i to compare the String from beginning and end.
If j can reach the end, the String itself is Palindrome. Otherwise, we divide the String by j, 
and get mid = s.substring(0, j) and suffix.
We reverse suffix as beginning of result and recursively call shortestPalindrome to get result of mid 
then appedn suffix to get result.
*/
