package Leetcode.july04;

import java.util.Arrays;
import java.util.Map;

public class MaximumProductofThreeNumbers628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int ans = Math.max((nums[0] * nums[1] * nums[nums.length-1]),
                (nums[nums.length-1] *nums[nums.length-2] *nums[nums.length-3]));

        return ans;
    }
}
