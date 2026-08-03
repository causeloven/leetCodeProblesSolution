package Leetcode.august;

import java.lang.foreign.Arena;
import java.util.Arrays;
import java.util.List;

public class HeightChecker1051{
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(heights);

        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(expected[i] != heights[i]){
                count++;
            }
        }

        return count;
    }
}
