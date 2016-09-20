public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0)
			return false;
		boolean[][] checker = new boolean[board.length][board[0].length];
		
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++)
                if(existHelper(checker, board, word, 0, i, j))
                    return true;
        return false;
    }
    public boolean existHelper(boolean[][] checker, char[][] board, String word, int i, int row, int col){
        if(checker[row][col]||board[row][col] != word.charAt(i))return false;
        checker[row][col] = true;
        if (i == word.length() - 1)//last char
			return true;
		if (row - 1 >= 0 && existHelper(checker, board, word, i + 1, row - 1, col))
			return true;
		if (row + 1 < board.length && existHelper(checker, board, word, i + 1, row + 1, col))
			return true;
		if (col - 1 >= 0 && existHelper(checker, board, word, i + 1, row, col - 1))
			return true;
		if (col + 1 < board[0].length && existHelper(checker, board, word, i + 1, row, col + 1))
			return true;
        checker[row][col]=false;
        return false;
    }
    
}