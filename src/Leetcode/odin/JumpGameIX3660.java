package Leetcode.odin;

public class JumpGameIX3660 {
    public int[] maxValue(int[] nums) {
        int[] leftMax = new int[nums.length];
        int[] rightMin = new int[nums.length];

        int maxL = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxL){
                maxL = nums[i];
                leftMax[i] = maxL;
            }else {
                leftMax[i] = maxL;
            }
        }

        int minR = Integer.MAX_VALUE;
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] < minR){
                minR = nums[i];
                rightMin[i] = minR;
            }else{
                rightMin[i] = minR;
            }
        }

        int start = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            if(i == nums.length - 1 || leftMax[i] <= rightMin[i + 1]){
                int maxForIsland = leftMax[i];

                for(int j = start; j < ans.length; j++){
                    ans[j] = maxForIsland;
                }

                start = i + 1;
            }
        }

        return ans;
    }
}
