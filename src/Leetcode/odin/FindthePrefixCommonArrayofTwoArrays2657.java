package Leetcode.odin;

import java.util.Arrays;

public class FindthePrefixCommonArrayofTwoArrays2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        //не понял почему массив н+1, типо в массив от 0- до н числа наверное
        int[] count = new int[A.length+1];
        Arrays.fill(count, 0);

        int common = 0;
        int[] C = new int[A.length];

        for(int i =0; i < A.length; i++){
            count[A[i]]++;
            if(count[A[i]] % 2 == 0){
                common++;
            }

            count[B[i]]++;
            if(count[B[i]] % 2 == 0){
                common++;
            }

            C[i] = common;


        }


        return C;
    }
}
