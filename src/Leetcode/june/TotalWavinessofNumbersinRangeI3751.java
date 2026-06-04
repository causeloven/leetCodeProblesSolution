package Leetcode.june;

public class TotalWavinessofNumbersinRangeI3751 {
    public int totalWaviness(int num1, int num2) {

        int count = 0;

        for(int i = num1; i <= num2; i++){
            String s = Integer.toString(i);
            char[] digits = s.toCharArray();
            if(digits.length < 3){continue;}

            for(int j = 1; j < digits.length-1; j++){
                if(digits[j] > digits[j-1] && digits[j] > digits[j+1]){
                    count++;
                }
                else if(digits[j] < digits[j-1] && digits[j] < digits[j+1]){
                    count++;
                }
            }
        }

        return count;
    }
}
