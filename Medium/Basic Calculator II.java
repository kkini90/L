/*
Implement a basic calculator to evaluate a simple expression string.

The expression string contains only non-negative integers, +, -, *, / operators and empty spaces. 
The integer division should truncate toward zero.

You may assume that the given expression is always valid.

Some examples:
"3+2*2" = 7
" 3/2 " = 1
" 3+5 / 2 " = 5
Note: Do not use the eval built-in library function.
*/
------------------------------------------------------------------------------------
public class Solution {
    public int calculate(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int len = s.length();
        
        //initalise sign and num
        char sign = '+';
        int num = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<s.length();i++){
            //if only digit
            if(Character.isDigit(s.charAt(i))){
                num = num *10 + s.charAt(i) - '0';
            }
            //if !digit and !space and last char
            if(!Character.isDigit(s.charAt(i)) && ' '!=s.charAt(i) || i==len-1){
                if(sign=='+'){
                    stack.push(num);
                }
                if(sign=='-'){
                    stack.push(-num);
                }
                if(sign=='*'){
                    stack.push(stack.pop()*num);
                }
                if(sign=='/'){
                    stack.push(stack.pop()/num);
                }
                //update sign and num
                sign = s.charAt(i);
                num = 0;
            }
        }
        
        int result=0;
        for(int i : stack){
            result+=i;
        }
        return result;
    }
}
