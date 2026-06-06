package Leetcode.june;

public class LeftandRightSumDifferences2574 {
    public int[] leftRightDifference(int[] nums) {

        int[] answer = new int[nums.length];
        int totalSum = 0;

        for(int i : nums){
            totalSum += i;
        }

        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum = totalSum - leftSum - nums[i];
            answer[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }

        return answer;
    }
}
