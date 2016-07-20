public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null)
            return 0;
        return minRecursive(grid, 0 ,0);
    }
    
    public int minRecursive(int[][] grid, int i, int j){
        if(i == grid.length-1 && j == grid[0].length-1){
            return grid[i][j];
        }else if(i == grid.length-1){
            return grid[i][j] + minRecursive(grid, i, j+1);
        }else if(j == grid[0].length-1){
            return grid[i][j] + minRecursive(grid, i+1, j);
        }else{
            return grid[i][j] + Math.min(minRecursive(grid, i+1, j),minRecursive(grid, i, j+1));
        }
    }
}