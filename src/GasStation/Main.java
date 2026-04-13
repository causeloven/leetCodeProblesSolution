package GasStation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        Solution solution = new Solution();
        System.out.println(solution.sortedSquares(nums));
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        for(int i = nums.length - 1; i >= 0 ; i--){
            if(Math.pow(nums[left], 2 ) >Math.pow(nums[right], 2 )){
                result[i] = (int) Math.pow(nums[left], 2 );
                left++;
            } else{
                result[i] = (int) Math.pow(nums[right], 2 );
                right--;
            }
        }

        return result;
    }
}
