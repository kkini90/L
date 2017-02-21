/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
*/
---------------------------------------------------------------------------
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        
    
        for(int i=0;i<rowIndex+1;i++){
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
            allRows.add(new ArrayList<Integer>(row));
        }
        List<Integer> rowRes = allRows.get(rowIndex);
        return rowRes;
    }
}
