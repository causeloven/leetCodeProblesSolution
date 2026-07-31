package Leetcode.july04;

import java.util.Arrays;

public class MinimumNumberofPushestoTypeWordII3016 {
    public int minimumPushes(String word) {

        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);
        int pushes = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            int level = (25 - i) / 8 + 1;
            pushes += freq[i] * level;
        }
        return pushes;
    }
}
