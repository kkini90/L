/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/
--------------------------------------------------------------------------------
public class Solution {
    public String reverseVowels(String s) {
        if(s ==null || s.length() == 0){
            return s;
        }
        HashSet<Character> vowelSet = new HashSet<Character>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');
        
        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(vowelSet.contains(c)){
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(!vowelSet.contains(c)){
                sb.append(c);
            }else{
                sb.append(stack.pop());
            }
        }
           return sb.toString(); 
    }
}
