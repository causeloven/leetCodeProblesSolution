package Leetcode.june;

public class Q1SumofCompatibleNumbersinRangeI {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        int rightB = n + k;

        for(int leftB = Math.max(1, n-k); leftB <= rightB; leftB++){
            int x = leftB;
            if((n & x) == 0){
                sum += x;
            }
        }

        return sum;
    }
}
