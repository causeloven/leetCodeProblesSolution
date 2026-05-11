package Leetcode.odin;

import java.util.ArrayList;
import java.util.List;

public class SeparatetheDigitsinanArray2553 {
    public int[] separateDigits(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for (int num : nums){
            String s = Integer.toString(num);
            for(char c : s.toCharArray()){
                answer.add(c - '0');
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
