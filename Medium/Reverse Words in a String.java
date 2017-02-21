/*
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Update (2015-02-12):
For C programmers: Try to solve it in-place in O(1) space.
*/
------------------------------------------------------------------------------------------
public class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int j = s.length();
        for(int i = s.length()-1; i >=  0; i--){
            if(s.charAt(i) == ' '){
                j=i;
            }else if(i == 0 || s.charAt(i-1) == ' '){
                if(reversed.length()!=0){
                    reversed.append(' ');
                }
                reversed.append(s.substring(i,j));
            }
        }
        return reversed.toString();
    }
}
/*
We can do better in one-pass. While iterating the string in reverse order, 
we keep track of a word’s begin and end position. 
When we are at the beginning of a word, we append it.
*/

//Time and spae complexity is both o(n)
