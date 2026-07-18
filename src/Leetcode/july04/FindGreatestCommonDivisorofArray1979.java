package Leetcode.july04;

import java.util.Arrays;

public class FindGreatestCommonDivisorofArray1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];

        int divisor = 1;
        int maxDivisor = 1;

        while(divisor <= max){
            if(max % divisor == 0 && min % divisor == 0){
                maxDivisor = Math.max(maxDivisor, divisor);
            }
            divisor++;
        }

        return maxDivisor;
    }
}
