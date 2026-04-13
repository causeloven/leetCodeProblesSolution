package GasStation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";

        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        Set<Character> window = new HashSet<>();

        while (right < s.length()){
            char c = s.charAt(right);

            if(!window.contains(c)){
                window.add(c);
                int currentSize = right - left + 1; // почему +1

                if(maxLength < currentSize){
                    maxLength = currentSize;
                }

                right++;

                }

            else {
                char leftChar = s.charAt(left);
                window.remove(leftChar);
                left++;
            }
        }

        return maxLength;
    }
}
