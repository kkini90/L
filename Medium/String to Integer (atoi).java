/*
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and 
ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
You are responsible to gather all the input requirements up front.
*/
------------------------------------------------------------------------------------------
public class Solution {
    public int myAtoi(String str) {
        int index = 0;
        double total = 0;
        boolean flag = false;
        
        //1. Empty string str ="  -123"
        if(str == null || str.length() < 1 ){
            return 0;
        }
        //2. Remove Spaces
        while(str.charAt(index) == ' ' && index<str.length()){
            index++;
        }
        //3. Handle signs
        if(str.charAt(index) == '-'){
            flag = true;
            index++;
        }else if(str.charAt(index) == '+'){
            index++;
        }
        // 4. calculate real value
        while(index<str.length() && str.charAt(index) >='0' && str.charAt(index) <='9'){
            total = total*10;
            total = total + (str.charAt(index++) - '0');
        }
        if(flag){
            total = -total;
        }
        //5. handle min & max
        if(total > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(total < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)total;
    }
}
/*
The following cases should be considered for this problem:

1. null or empty string
2. white spaces
3. +/- sign
4. calculate real value
5. handle min & max
*/
