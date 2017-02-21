/*
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*/
---------------------------------------------------------------------------
public class Solution {
    public List<String> letterCombinations(String digits) {
       List<String> result = new ArrayList<String>();
       if(digits == null || digits.length() == 0){
           return result;
       }
       Map<Character,char[]> map = new HashMap<Character,char[]>();
        map.put('2', new char[]{'a','b','c'});
        map.put('3', new char[]{'d','e','f'});
        map.put('4', new char[]{'g','h','i'});
        map.put('5', new char[]{'j','k','l'});
        map.put('6', new char[]{'m','n','o'});
        map.put('7', new char[]{'p','q','r','s'});
        map.put('8', new char[]{'t','u','v'});
        map.put('9', new char[]{'w','x','y','z'});
        
        helper(digits, result,map,0,new StringBuilder());
        return result;
    }
    
    private void helper(String digits, List<String> result,Map<Character,char[]> map,int index, StringBuilder sb){
        if(index>=digits.length()){
            result.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        char[] arr= map.get(c);
        
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            helper(digits,result,map,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
