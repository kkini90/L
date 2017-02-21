/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
*/
------------------------------------------------------------------------------------------
public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=1;i<n;i++){
            s = countIndx(s);
        }
        return s;
    }
    
    private String countIndx(String s){
        StringBuilder sb = new StringBuilder();
        int count =1;
        char c = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }else{
                sb.append(count);
                sb.append(c);
                count =1;
                c = s.charAt(i);
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}
