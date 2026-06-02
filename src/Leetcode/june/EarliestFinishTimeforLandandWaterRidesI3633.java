package Leetcode.june;

public class EarliestFinishTimeforLandandWaterRidesI3633 {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int answer = Integer.MAX_VALUE;

        for(int i = 0; i < landStartTime.length; i++){
            for(int j = 0; j < waterStartTime.length; j++){

                int t1 = landStartTime[i] + landDuration[i];
                int t2 = Math.max(t1, waterStartTime[j]) + waterDuration[j];
                answer = Math.min(answer, t2);

                t1 = waterStartTime[j] + waterDuration[j];
                t2 = Math.max(t1, landStartTime[i]) + landDuration[i];
                answer = Math.min(answer, t2);

            }
        }

        return answer;
    }
}
