package Leetcode.odin;

public class RotatingtheBox1861 {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        char[][] result = new char[n][m];
        // cтроки стоблцы
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result[i][j] = '.';
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                result[j][m-1-i] = boxGrid[i][j];
            }
        }


        for(int col = 0; col < m; col++) {
            int lowestEmpty = n - 1;

            for(int row = n - 1; row >= 0; row--) {
                if(result[row][col] == '*') {
                    lowestEmpty = row - 1;
                }
                else if(result[row][col] == '#') {
                    if(row != lowestEmpty) {
                        result[lowestEmpty][col] = '#';
                        result[row][col] = '.';
                    }
                    lowestEmpty--;
                }
            }
        }
        return result;
    }
}
