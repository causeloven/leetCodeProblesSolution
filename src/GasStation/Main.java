package GasStation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        Solution solution = new Solution();
        System.out.println(solution.minWindow(s,t));
    }
}

class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        Map<Character, Integer> targetMap = new HashMap<>();
        for(char c : t.toCharArray()){
            targetMap.put(c, targetMap.getOrDefault(c,0)+1);//этот метод подсмотрел в инете
        }
        int required = targetMap.size();
        int formed = 0;

        Map<Character, Integer> windowMap = new HashMap<>();

        while(right < s.length()){
            char c = s.charAt(right);

            windowMap.put(c, windowMap.getOrDefault(c,0)+1);

            if(targetMap.containsKey(c) && targetMap.get(c).equals(windowMap.get(c))){
                formed++;
            }

            while(left<=right && formed == required){

                int currentLength = right - left + 1;
                if(currentLength < minLength){
                    minLength = currentLength;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);

                windowMap.put(leftChar, windowMap.get(leftChar)-1);

                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)){
                    formed--;
                }

                left++;

            }

            right++;
        }

        if(minLength == Integer.MAX_VALUE){
            return "";
        }else {
            return s.substring(startIndex, startIndex+minLength);
        }
    }
}
