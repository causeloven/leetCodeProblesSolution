package Leetcode.May.sudokuAlog;

import java.util.Arrays;
import java.util.Scanner;

public class MainSudoku {

    private static Scanner sc = new Scanner(System.in);
    private static SolutionSudoku solutionSudoku = new SolutionSudoku();


    public static void main(String[] args){
        boolean inProcess = true;

        while(inProcess){


            int[] arr = userInput();
            int[] answer = solutionSudoku.Solution(arr);

            for(int i : answer){
                System.out.print(i + " ");
            }

            inProcess = false;


        }
    }


    public static int[] userInput(){
        System.out.println("Input string - 1,?,3");
        String str = sc.nextLine();

        String[] arrStr = str.split(",");

        for(int i = 0; i < arrStr.length; i++){
            if(arrStr[i].equals("?")) {
                arrStr[i] = "11";
            }
        }
//
//        for(String s : arrStr){
//            System.out.print(s + " ");
//        }

        int[] arrInt = new int[arrStr.length];

        for(int i = 0; i < arrStr.length; i++){
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        return arrInt;
    }
}


