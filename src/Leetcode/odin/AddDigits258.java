package Leetcode.odin;

import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class AddDigits258 {
    public int addDigits(int num) {
        int n = num;

        while (n >= 10){
            n = NSum(n);
        }

        return n;
    }

    public int NSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
}
