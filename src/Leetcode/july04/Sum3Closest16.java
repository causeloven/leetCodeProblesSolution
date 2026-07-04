package Leetcode.july04;

import java.util.Arrays;

public class Sum3Closest16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int bestSum = Integer.MAX_VALUE;

        for(int i = 0; i < n-2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];

                if(Math.abs(currentSum-target) < Math.abs(bestSum - target)){
                    bestSum = currentSum;
                }

                if(currentSum < target){
                    left++;
                }else if(currentSum > target){
                    right--;
                }else if(currentSum == target){
                    return currentSum;
                }
            }
        }

        return bestSum;
    }
}
