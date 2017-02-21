/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
*/
------------------------------------------------------------------------
public class Solution {
    public List<String> generateParenthesis(int n) {
        char[] str= new char[n*2];
        ArrayList<String> list = new ArrayList<String>();
        generate(n,n,0,str,list);
        
        Iterator<String> itr= list.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        return list;
        
    }
    
    private void generate(int leftRem,int rightRem, int count, char[] str, ArrayList<String> list){
        if(leftRem < 0 || leftRem > rightRem) return;
        
        if(leftRem ==0 && rightRem ==0){
            String s = String.copyValueOf(str);
            list.add(s);
        }else{
            if(leftRem>0){
                str[count] = '(';
                generate(leftRem-1,rightRem,count+1,str,list);
            }
            if(rightRem>leftRem){
                str[count] = ')';
                generate(leftRem,rightRem-1,count+1,str,list);
            }
        }
    }
}
