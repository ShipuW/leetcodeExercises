public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0)   
            return res;
        int dir = 0;
        int leftBound = 0;
        int upBound = 0;
        int rightBound = matrix[0].length - 1;
        int downBound = matrix.length - 1;
        while((leftBound <= rightBound) && (upBound<=downBound)){
            if(dir == 0){//rightward
                for(int j = leftBound; j <= rightBound; j++){
                    res.add(matrix[upBound][j]);
                }
                upBound++;
            }else if(dir == 1){//downward
                for(int i = upBound; i <= downBound; i++){
                    res.add(matrix[i][rightBound]);
                }
                rightBound--;
            }else if(dir == 2){//leftward
                for(int j = rightBound; j >= leftBound; j--){
                    res.add(matrix[downBound][j]);
                }
                downBound--;
            }else{//upward
                for(int i = downBound; i >= upBound; i--){
                    res.add(matrix[i][leftBound]);
                }
                leftBound++;
            }
            dir = (dir+1) % 4;
        }
        

        return res;
    }
}