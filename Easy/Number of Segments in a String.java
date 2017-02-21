/*
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
*/
--------------------------------------------------------------------------------
public class Solution {
    public int countSegments(String s) {
        if(s == null || s.isEmpty()) return 0;
        char[] cArray = s.toCharArray();
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            if((i==0 && cArray[0]!=' ') || (i>0 && cArray[i]!=' ' && cArray[i-1]==' ')){
                count++;
            }
        }
        return count;
    }
}
