package Leetcode.odin;

import java.util.Arrays;

public class CheckifArrayisGood2784 {
    public boolean isGood(int[] nums) {
        int n = nums.length-1;
        if(nums.length < 1) return false;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] != i+1) return false;

        }

        return nums[n] == n && nums[n-1] == n;
    }
}
