package Leetcode.july04;

import java.util.Arrays;

public class KokoEatingBananas875 {
    public int minEatingSpeed(int[] piles, int h) {
        long left = 1;
        long right = Arrays.stream(piles).max().getAsInt();

        while(left < right){
            long mid = left + (right-left)/2;
            long totalHours = 0;

            for(int pile : piles){
                totalHours += (pile + mid - 1)/mid;
                if(totalHours >  h) break;
            }

            if(totalHours <= h){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return (int) left;
    }
}
