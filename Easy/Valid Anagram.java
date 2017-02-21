/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] letters = new int[128];
        
        if(s.length() != t.length()){
            return false;
        }
        
        char[] sArray = s.toCharArray();
        for(char c : sArray){
            letters[c]++;
        }
        
        for(int i=0;i<t.length();i++){
            int val = (int)t.charAt(i);
            if(--letters[val] < 0){
                return false;
            }
        }
        return true;
    }
}
