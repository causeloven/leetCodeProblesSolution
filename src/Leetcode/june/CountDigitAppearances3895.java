package Leetcode.june;

public class CountDigitAppearances3895 {
    public int countDigitOccurrences(int[] nums, int digit) {

        int count = 0;
        for(int i : nums){
            while(i > 0){
                int curr = i%10;
                if(curr == digit){
                    count++;
                }
                i /=10;
            }
        }

        return count;

    }
}
