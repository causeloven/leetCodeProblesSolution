package Leetcode.june;

import java.util.Arrays;

public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int[] row : result) Arrays.fill(row, -1);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    result = setZeroes(result, i, j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(result[i][j] == -1){
                    result[i][j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(result[i], 0, matrix[i], 0, matrix[0].length);
        }
    }

    public int[][] setZeroes(int[][] matrix, int i, int j){
        for(int g = 0; g < matrix.length; g++){
            matrix[g][j] = 0;
        }

        for(int g = 0; g < matrix[0].length; g++){
            matrix[i][g] = 0;
        }

        return matrix;
    }
}
