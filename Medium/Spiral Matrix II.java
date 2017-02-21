/*
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
*/

------------------------------------------------------------------------------------
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        if(n==0){
            return matrix;
        }
        
        int rowStart=0;
        int rowEnd = n-1;
        int colStart=0;
        int colEnd = n-1;
        int num =1;
        
        while(rowStart<=rowEnd && colStart<=colEnd){
            //traverse right
            for(int i=colStart;i<=colEnd;i++){
                matrix[rowStart][i] = num++;
            }
            rowStart++;
            //traverse down
            for(int i=rowStart;i<=rowEnd;i++){
                matrix[i][colEnd] = num++;
            }
            colEnd--;
            
                //traverse left
                for(int i=colEnd;i>=colStart;i--){
                    if(rowStart<=rowEnd)
                        matrix[rowEnd][i] = num++;
                }
                rowEnd--;
            
                //traverse up
                for(int i=rowEnd;i>=rowStart;i--){
                    if(colStart<=colEnd)
                        matrix[i][colStart] = num++;
                }
                colStart++;
            
        }
        return matrix;
    }
}
