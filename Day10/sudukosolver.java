class Solution {
    public boolean isValid(char[][] board, int row, int col, char ch) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == ch) return false;
        }
        
        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) return false;
        }

        // Check subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == ch) return false;
            }
        }
        return true;
    }

    public boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, row, col, ch)) {
                            board[row][col] = ch;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[row][col] = '.'; // Backtrack
                            }
                        }
                    }
                    return false; // No valid solution found
                }
            }
        }
        return true; // Sudoku solved successfully
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}