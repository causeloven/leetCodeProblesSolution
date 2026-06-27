package Leetcode.june;

import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits2160 {
    public int minimumSum(int num) {
        int[] digits = new int[4];

        int i = 3;
        while(i >= 0){
            digits[i] = num % 10;
            num /= 10;
            i--;
        }

        Arrays.sort(digits);
        int result = (10 * (digits[0] + digits[1])) + (digits[2] + digits[3]);
        return result;
    }
}
