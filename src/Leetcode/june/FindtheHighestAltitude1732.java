package Leetcode.june;

public class FindtheHighestAltitude1732 {
    public int largestAltitude(int[] gain) {
        int maxG = Integer.MIN_VALUE;
        int currentG = 0;

        for(int g : gain){
            currentG += g;
            maxG = Math.max(currentG,maxG);
        }
        if(maxG < 0){
            maxG = 0;
        }
        return maxG;
    }
}
