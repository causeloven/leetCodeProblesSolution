package Leetcode.june;

import java.util.Arrays;

public class RichestCustomerWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int[] i :  accounts){
            int curr = Arrays.stream(i).sum();
            if(max < curr){
                max = curr;
            }
        }

        return max;

    }
}
