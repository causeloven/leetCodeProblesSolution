package Leetcode.july04;

import java.util.Arrays;

public class MaximumProductofTwoElementsinanArray1464 {
    public int maxProduct(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i]--;
        }

        Arrays.sort(nums);

        return nums[nums.length-1] * nums[nums.length-2];
    }
}
