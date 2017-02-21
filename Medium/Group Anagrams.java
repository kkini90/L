/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/
---------------------------------------------------------------------------
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        
        for(int i=0;i<strs.length;i++){
            String key = sorted(strs[i]);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
                map.get(key).add(strs[i]);
        }
        
        for(Map.Entry<String,ArrayList<String>> entry : map.entrySet()){
            List<String> list = entry.getValue();
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }
    
    private static String sorted(String str){
        char[] s = str.toCharArray();
        java.util.Arrays.sort(s);
        return new String(s);
    }
}
