class Solution {
    public boolean helper(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }

        int nextRow = row, nextCol = col + 1;
        if (col == 8) { 
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        for (int dig = 1; dig <= 9; dig++) {
            if (isSafe(board, row, col, dig)) {
                board[row][col] = (char) ('0' + dig);

                if (helper(board, nextRow, nextCol)) {
                    return true;
                }

                board[row][col] = '.'; 
            }
        }
        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, int dig) {
        char d = (char) ('0' + dig);

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == d) return false;
            if (board[i][col] == d) return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == d) return false;
            }
        }

        return true;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
