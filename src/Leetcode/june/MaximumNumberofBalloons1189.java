package Leetcode.june;

import java.util.HashMap;

public class MaximumNumberofBalloons1189 {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char c : text.toCharArray()){
            freq[c-'a']++;
        }

        char[] needed = {'b','a','l','o','n'};
        char[] neededCount = {1,1,2,2,1};

        int result = Integer.MAX_VALUE;

        for(int i = 0; i < needed.length; i++){
            int availible = freq[needed[i]-'a'];
            int need = neededCount[i];
            int canForm = availible / need;
            result = Math.min(canForm, result);
        }
        return result;
    }
}
