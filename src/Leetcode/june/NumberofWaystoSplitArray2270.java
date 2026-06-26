package Leetcode.june;

public class NumberofWaystoSplitArray2270 {
    public int waysToSplitArray(int[] nums) {
        long sumRight = 0;

        for(int i : nums){
            sumRight += i;
        }

        int count = 0;
        long sumLeft = 0;
        for(int i = 0; i < nums.length-1; i++){
            sumLeft += nums[i];
            sumRight -= nums[i];

            if(sumLeft >= sumRight){
                count++;
            }
        }
        return count;

    }
}
