package Leetcode.august;

public class SmallestDivisibleDigitProductI3345 {
    public int smallestNumber(int n, int t) {
        while(true){
            if(digit(n) % t == 0){
                break;
            }
            n++;
        }
        return  n;
    }

    private int digit(int a){
        if (a == 0) return 0;
        int result = 1;

        while(a > 0){
            int b = a%10;
            result *= b;
            a /= 10;
        }

        return result;

    }
}
