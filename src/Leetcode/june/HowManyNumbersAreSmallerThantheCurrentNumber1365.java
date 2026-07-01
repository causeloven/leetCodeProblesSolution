package Leetcode.june;

import java.util.HashMap;

public class HowManyNumbersAreSmallerThantheCurrentNumber1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length;i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    map.put(i,map.getOrDefault(i,0)+1);
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = map.getOrDefault(i,0);
        }

        return nums;
    }
}
