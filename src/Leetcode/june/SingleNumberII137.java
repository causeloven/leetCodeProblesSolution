package Leetcode.june;

import java.util.HashMap;

public class SingleNumberII137 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : nums){
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }

        int result = -1;

        for(int i : nums){
            if(hashMap.get(i) == 1){
                result = i;
                break;
            }
        }

        return result;
    }
}
