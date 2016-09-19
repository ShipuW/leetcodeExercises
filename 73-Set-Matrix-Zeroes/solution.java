import java.util.Hashtable;
public class Solution {
    public void setZeroes(int[][] matrix) {
       /* Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
        for(int i = 0; i < matrix.length; i++){
            boolean isZeroRow = false;
            for(int j = 0; j < matrix[0].length; j++){
                if(isZeroRow){
                    matrix[i][j] = 0;
                }
                else if(matrix[i][j] == 0){
                    table.put(j,true);
                    j = -1;//执行完成要 ++ //wrong more than one zero in one line;

                    isZeroRow = true;
                }else{
                    continue;
                }
            }
        }
        for (Integer key : table.keySet()) {
            for(int i = 0; i < matrix.length; i++){
                matrix[i][key] = 0;
            }
        }*/
        int row = matrix.length;
		if (row < 1)
			return;
		int col = matrix[0].length;
		boolean[] colRecorder = new boolean[col];
		boolean[] rowRecorder = new boolean[row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 0) {
					rowRecorder[i] = true;
					colRecorder[j] = true;
				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (rowRecorder[i])
					matrix[i][j] = 0;
				else if (colRecorder[j])
					matrix[i][j] = 0;
			}
		}

    }
}