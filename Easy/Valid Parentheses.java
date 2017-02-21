/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
------------------------------------------------------------------------------------------------------------------------------
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c=='(' ||c=='[' ||c=='{'){
                stack.push(c);
            }else if(c==')' ||c==']' ||c=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != map.get(c)){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
        
    }
}
