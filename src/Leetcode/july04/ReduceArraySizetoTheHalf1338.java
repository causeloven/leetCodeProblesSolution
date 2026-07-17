package Leetcode.july04;

import java.util.*;

public class ReduceArraySizetoTheHalf1338 {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0)+1);
        }

        List<Integer> counts = new ArrayList<>(freq.values());
        Collections.sort(counts, Collections.reverseOrder());

        int removed = 0;
        int setSize = 0;
        int half = arr.length / 2;

        for(int c : counts){
            removed += c;
            setSize++;
            if(removed >= half){
                break;
            }
        }

        return setSize;
    }
}
