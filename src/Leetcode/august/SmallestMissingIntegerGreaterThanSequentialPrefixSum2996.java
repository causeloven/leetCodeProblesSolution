package Leetcode.august;

import java.util.HashSet;
import java.util.Set;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum2996 {
    public int missingInteger(int[] nums) {
        int sum = nums[0];                // накапливаем сумму префикса
        int i = 1;
        while (i < nums.length && nums[i] == nums[i-1] + 1) {
            sum += nums[i];
            i++;
        }
        Set<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        int x = sum;

        while (hashSet.contains(x)){
            x++;
        }

        return x;
    }
}
