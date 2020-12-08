package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (Win.checkCol(board, i) || Win.checkRow(board, i))
                    rsl = true;
            }
        }
        return  rsl;
    }
    public static boolean checkRow(int[][] board, int col) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if(board[row][col] == 0)
                rsl = false;
        }
    return  rsl;
    }
    public static boolean checkCol(int[][] board, int row) {
        boolean rsl = true;
        for (int col = 0; col < board.length; row++) {
            if(board[row][col] == 0)
                rsl = false;
        }
        return  rsl;
    }
}
