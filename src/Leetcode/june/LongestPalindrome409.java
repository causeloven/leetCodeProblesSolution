package Leetcode.june;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        //"abccccdd"
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }


        int count = 0;
        boolean oddFound = false;

        for(int j : map.values()){
            count += (j/2) * 2;
            if(j % 2 == 1){
                oddFound = true;
            }
        }

        if(oddFound){
            return count + 1;
        }else {
            return count;
        }
    }
}
