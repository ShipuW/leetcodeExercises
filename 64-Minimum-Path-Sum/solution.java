public class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
		int col = grid[0].length;
		
		int[][] dist = new int[row][col];
		dist[0][0] = grid[0][0];
		
		for (int i = 1; i < row; i++){
		    dist[i][0] = dist[i-1][0] + grid[i][0];
		}
		
		for (int i = 1; i < col; i++){
		    dist[0][i] = dist[0][i-1] + grid[0][i];
		}

        for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				dist[i][j] = Math.min(dist[i - 1][j], dist[i][j - 1]) + grid[i][j];
			}
		}
		return dist[row - 1][col - 1];
    }
    
}