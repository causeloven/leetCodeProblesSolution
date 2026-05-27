package Leetcode.May;

public class CounttheNumberofSpecialCharactersII3121 {
    public int numberOfSpecialChars(String word) {
        char[] arr = word.toCharArray();

        boolean[] lowerSeen = new boolean[26];
        boolean[] upperSeen = new boolean[26];
        boolean[] invalid = new boolean[26];

        for(int i = 0; i < arr.length; i++){
            if(Character.isLowerCase(arr[i])){
                int index = arr[i] - 'a';
                if(upperSeen[index]){
                    invalid[index] = true;
                }
                lowerSeen[index] = true;
            }
            if(Character.isUpperCase(arr[i])){
                int index = arr[i] - 'A';

                upperSeen[index] = true;

            }
        }

        int result = 0;

        for(int i = 0; i < 26; i++){
            if(lowerSeen[i] && upperSeen[i] && !invalid[i]){
                result++;
            }
        }

        return result;
    }
}
