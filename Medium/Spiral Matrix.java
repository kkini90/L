/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
*/
------------------------------------------------------------------------------------------------------------
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        
        if(matrix.length == 0){
            return res;
        }
        
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;
        
        while(rowStart<=rowEnd && colStart<=colEnd){
            //traverse right
            for(int i=colStart;i<=colEnd;i++){
                res.add(matrix[rowStart][i]);
            }
            rowStart++;
            
            //traverse down
            for(int i=rowStart;i<=rowEnd;i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            if(rowStart<=rowEnd){
                //traverse left
                for(int i=colEnd;i>=colStart;i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            
            if(colStart<=colEnd){
                //traverse up
                for(int i=rowEnd;i>=rowStart;i--){
                    res.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return res;
    }
}
