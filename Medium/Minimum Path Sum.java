/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right 
which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
*/
------------------------------------------------------------------------------------
public class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( i==0 && j==0){
                    grid[i][j] = grid[i][j];
                }
                if( i==0 && j!=0){
                    grid[i][j] += grid[i][j-1];
                }
                if( i!=0 && j==0){
                    grid[i][j] += grid[i-1][j];
                }
                if( i!=0 && j!=0){
                    grid[i][j] += Math.min(grid[i][j-1],grid[i-1][j]);
                }
            }
        }
        return grid[n-1][m-1];
    } 
}
