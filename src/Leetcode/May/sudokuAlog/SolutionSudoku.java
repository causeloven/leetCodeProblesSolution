package Leetcode.May.sudokuAlog;

public class SolutionSudoku {

    public int[] Solution(int[] arr){

        int digit = 10;
        int missDigit = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 11){
                missDigit = i;
                continue;
            }
            digit -= arr[i];
        }

        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i];

            if(i == missDigit){
                result[i] = digit;
            }
        }
        return result;
    }
}
