package Leetcode.august;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContiguousArray525 {
    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        int prefix = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < nums.length; i++){
            prefix += (nums[i] == 0)   ? -1 : 1;
            if (map.containsKey(prefix)) {
                int prevIndex = map.get(prefix);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                map.put(prefix, i);
            }
        }
        return maxLen;
    }
}
