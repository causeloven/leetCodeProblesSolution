package Leetcode.july04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformofanArray1331 {
    public int[] arrayRankTransform(int[] arr) {

        int[] helpArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(helpArr);

        Map<Integer,Integer> map = new HashMap<>();

        int rank = 1;
        for(int i = 0; i < helpArr.length; i++){
            if(i >0 && helpArr[i] == helpArr[i-1]) continue;
            map.put(helpArr[i], rank);
            rank++;
        }

        for(int i = 0; i < arr.length; i++){
            int value = map.get(arr[i]);
            arr[i] = value;
        }

        return arr;

    }
}
