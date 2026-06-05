package Leetcode.june;

import java.util.Arrays;

public class MinimumRemovalstoBalanceArray3634 {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < nums.length;right++){
            while(nums[right] > nums[left] * k){
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return nums.length - maxLength;
    }
}
