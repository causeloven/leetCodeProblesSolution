package Leetcode.june;

public class BestSightseeingPair1014 {
    public int maxScoreSightseeingPair(int[] values) {
        int bestLeft = values[0] + 0;
        int answer = Integer.MIN_VALUE;

        for(int j = 1; j < values.length; j++){
            int current = bestLeft + values[j]-j;
            answer = Math.max(answer, current);
            bestLeft = Math.max(bestLeft, values[j]+j);
        }

        return answer;
    }
}
