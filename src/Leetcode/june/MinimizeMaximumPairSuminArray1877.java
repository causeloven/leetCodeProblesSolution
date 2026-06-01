package Leetcode.june;

import java.util.Arrays;

public class MinimizeMaximumPairSuminArray1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxPair = Integer.MIN_VALUE;
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int pair = nums[i] + nums[j];
            if(maxPair < pair){
                maxPair = pair;
            }

            i++; j--;
        }

        return maxPair;
    }
}
