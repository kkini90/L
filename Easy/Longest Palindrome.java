/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that 
can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.
*/
Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
------------------------------------------------------------------------------------------------
public class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count++;
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            return count*2+1;
        }else{
            return count*2;
        }
    }
}
//TC:O(n)
//SC:O(n)
//eg:abccccdd
