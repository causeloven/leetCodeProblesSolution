package Leetcode.august;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class IntersectionofTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> mapNums1 = new HashMap<>();

        for(int i : nums1){
            mapNums1.put(i, mapNums1.getOrDefault(i,0)+1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i : nums2){
            if (mapNums1.containsKey(i) && mapNums1.get(i) > 0){
                result.add(i);
                mapNums1.put(i, mapNums1.getOrDefault(i, 0)-1);
                if(mapNums1.get(i)  == 0){
                    mapNums1.remove(i);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }


}
