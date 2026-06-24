package Leetcode.june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindMissingElements3731 {
    public List<Integer> findMissingElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(max < i) max = i;
            if(min > i) min = i;
            set.add(i);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = min; i < max; i++){
            if(set.contains(i)){
                continue;
            }else {
                result.add(i);
            }
        }

        return result;

    }

}
