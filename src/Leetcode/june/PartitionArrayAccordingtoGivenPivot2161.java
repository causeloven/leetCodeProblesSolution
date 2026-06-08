package Leetcode.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PartitionArrayAccordingtoGivenPivot2161 {
    public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> more = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                less.add(nums[i]);
            } else if (nums[i] == pivot) {
                equal.add(nums[i]);
            }else if(nums[i] > pivot){
                more.add(nums[i]);
            }
        }
        int[] result = Stream.of(less,equal,more).flatMap(List::stream).mapToInt(Integer::intValue).toArray();

        return result;
    }
}
