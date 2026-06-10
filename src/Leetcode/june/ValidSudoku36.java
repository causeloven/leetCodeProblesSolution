package Leetcode.june;

import java.util.Arrays;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int digit = board[i][j] - '1';

                if(rows[i][digit]) return false;
                else rows[i][digit] = true;

                if(cols[j][digit]) return false;
                else cols[j][digit] = true;

                int box = (i/3)*3 + (j/3);

                if(boxes[box][digit]) return false;
                else boxes[box][digit] = true;
            }
        }

        return true;


    }


}
