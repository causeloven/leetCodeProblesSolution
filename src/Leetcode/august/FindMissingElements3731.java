package Leetcode.august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements3731 {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            int diff = nums[i] - nums[i - 1];
            for (int j = 1; j < diff; j++) {
                result.add(nums[i - 1] + j);
            }
        }
        return result;

    }
}
