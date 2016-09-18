public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int direction = 0;
        int upBound = 0;
        int downBound = n - 1;
        int leftBound = 0;
        int rightBound = n - 1; 
        int curNum = 1;
        while((leftBound <= rightBound) && (upBound<=downBound)){
            switch(direction)
            {
                case 0:
                    for(int i = leftBound; i <= rightBound; i++ ){
                        res[upBound][i] = curNum++;
                    }
                    upBound++;
                    break;
                case 1:
                    for(int i = upBound; i <= downBound; i++ ){
                        res[i][rightBound] = curNum++;
                    }
                    rightBound--;
                    break;
                case 2:
                    for(int i = rightBound; i >= leftBound; i-- ){
                        res[downBound][i] = curNum++;
                    }
                    downBound--;
                    break;
                case 3:
                    for(int i = downBound; i >= upBound; i-- ){
                        res[i][leftBound] = curNum++;
                    }
                    leftBound++;
                    break;
                
            }
            direction = (direction + 1) % 4;
            
        }
        
        return res;
    }
}