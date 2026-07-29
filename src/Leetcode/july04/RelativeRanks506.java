package Leetcode.july04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks506 {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        for(int i = 0; i < score.length/2; i++){
            int temp = sorted[i];
            sorted[i] = sorted[score.length - i - 1];
            sorted[score.length - i - 1] = temp;
        }

        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                rankMap.put(sorted[i], "Gold Medal");
            } else if (i == 1) {
                rankMap.put(sorted[i], "Silver Medal");
            } else if (i == 2) {
                rankMap.put(sorted[i], "Bronze Medal");
            } else {
                rankMap.put(sorted[i], String.valueOf(i + 1));
            }
        }

        // 3. Формируем ответ в исходном порядке
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = rankMap.get(score[i]);
        }
        return answer;
    }
}
