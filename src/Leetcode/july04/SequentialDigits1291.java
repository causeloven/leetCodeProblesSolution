package Leetcode.july04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for(int start = 1; start <= 9; start++){
            int num = start;
            int nextDigit = start;

            while(nextDigit <= 9){
                if(num >= low && num <= high){
                    result.add(num);
                }
                nextDigit++;

                num = num * 10 + nextDigit;
            }
        }

        Collections.sort(result);
        return result;

    }
}
