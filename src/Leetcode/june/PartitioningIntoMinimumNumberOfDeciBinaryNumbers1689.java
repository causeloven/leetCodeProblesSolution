package Leetcode.june;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers1689 {
    public int minPartitions(String n) {

        int maxDigit = Integer.MIN_VALUE;

        for(int i = 0; i < n.length(); i++){
            int d = n.charAt(i) - '0';

            if(maxDigit < d){
                maxDigit = d;
            }
        }

        return maxDigit;
    }
}
