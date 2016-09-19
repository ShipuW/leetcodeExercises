public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;//!!
        if(matrix[0][0] > target) return false;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] > target){ 
                row = i-1;
                break;//!!
            }
        }
        
        for(int i = 0; i < matrix[row].length; i++){
            if(matrix[row][i] == target) return true;
        }
        return false;
    }
}