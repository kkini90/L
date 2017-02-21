/*
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/
----------------------------------------------------------------------------------------
public class Solution {
    public int strStr(String haystack, String needle) {
        char[] text = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        
        int n = haystack.length();
        int m = needle.length();
        int index =-1;
        
        for(int i =0;i<=n-m;i++){
            int j=0;
            while(j<m && pattern[j] == text[i+j]){
                j++;
            }
            if(j==m){
                 index = i;
                 return index;
            }
        }
        return index;
    }
}
