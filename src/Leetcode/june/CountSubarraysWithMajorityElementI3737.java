package Leetcode.june;

public class CountSubarraysWithMajorityElementI3737 {
    public int countMajoritySubarrays(int[] nums, int target) {

        int answer = 0;

        for(int i = 0; i < nums.length; i++){

            int count = 0;

            for(int j = i; j < nums.length; j++){
                if(nums[j] == target) count++;
                if(count * 2 > (j-i+1)) answer++;
            }

        }

        return answer;
    }
}
