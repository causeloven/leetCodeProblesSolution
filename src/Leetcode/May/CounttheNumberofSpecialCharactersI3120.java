package Leetcode.May;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CounttheNumberofSpecialCharactersI3120 {
    public int numberOfSpecialChars(String word) {
        char[] arr = word.toCharArray();;

        int[] lower = new int[26];
        Arrays.fill(lower, -1);
        int[] upper = new int[26];
        Arrays.fill(upper, -1);

        for(int i  = 0; i < arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                int index = arr[i] - 'A';
                lower[index] = 1;
            }
            if (Character.isLowerCase(arr[i])){
                int index = arr[i] - 'a';
                upper[index] = 1;
            }
        }

        int count = 0;
        for(int i = 0; i < 26; i++){
            if(upper[i] == 1 && lower[i] == 1){
                count++;
            }
        }

        return count;
    }
}
