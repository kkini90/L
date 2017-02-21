/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
*/
--------------------------------------------------------------------------------
public class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0){
	        return 0;
	    }
	    int count  =0;
	    int lenIndex=s.length()-1;

	    for( int z=s.length()-1;z>=0 && s.charAt(z)== ' ';z--){
	        lenIndex--;
	    }
	    for(int i=lenIndex;i>=0;i--){
	        if(s.charAt(i)!= ' '){
	            count++;
	        }else{
	            break;
	        }
	    }
	    return count;
    }
}
