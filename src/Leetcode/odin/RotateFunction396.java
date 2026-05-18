package Leetcode.odin;

import java.util.Arrays;
import java.util.HashMap;

public class RotateFunction396 {
    public int maxRotateFunction(int[] nums) {
        int total = 0;

        for(int i : nums){
            total += i;
        }

        int f0 = 0;
        for(int i = 0; i < nums.length; i++){
            f0 += nums[i] * i;
        }

        int max = f0;
        int prev = f0;

        for(int k = 1; k < nums.length; k++){

            int fk = prev + total - nums.length * nums[nums.length - k];

            if(fk > max){
                max = fk;
            }
            prev = fk;
        }

        return max;
    }
}
