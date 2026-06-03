package Leetcode.june;

public class EarliestFinishTimeforLandandWaterRidesII3635 {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int bestLandFinish = Integer.MAX_VALUE;
        int bestWaterFinish = Integer.MAX_VALUE;

        for(int i = 0; i < landStartTime.length; i++){
            int timeLand = landStartTime[i] + landDuration[i];
            if(bestLandFinish > timeLand){
                bestLandFinish = timeLand;
            }
        }

        for(int i = 0; i < waterStartTime.length; i++){
            int timeWater = waterStartTime[i] + waterDuration[i];
            if(bestWaterFinish > timeWater){
                bestWaterFinish = timeWater;
            }
        }

        int timeLandWater = Integer.MAX_VALUE;
        for(int i = 0; i < waterStartTime.length; i++){
            int time = Math.max(bestLandFinish, waterStartTime[i]) + waterDuration[i];
            if(timeLandWater > time){
                timeLandWater = time;
            }
        }

        int timeWaterLand = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++){
            int time = Math.max(bestWaterFinish, landStartTime[i]) + landDuration[i];
            if(timeWaterLand > time){
                timeWaterLand = time;
            }
        }

        return Math.min(timeLandWater,timeWaterLand);
    }
}
