package Leetcode.june;

public class WordSearch79 {
    public boolean exist(char[][] board, String word) {

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if (search(i, j, 0, board, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean search(int i, int j, int index, char[][] board, String word){
        if(word.length() == index) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length) return false;
        if(board[i][j] != word.charAt(index)) return false;


        char temp = board[i][j];
        board[i][j] = '!';

        boolean found = search(i-1,j,index+1,board,word) ||
                search(i+1,j,index+1,board,word) ||
                search(i,j+1,index+1,board,word) ||
                search(i,j-1,index+1,board,word);

        board[i][j] = temp;

        return found;
    }
}
