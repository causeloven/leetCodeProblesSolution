package Leetcode.Collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getInt(n);
        }

        return n==1;
    }

    private int getInt(int n){
        int sum = 0;

        while(n>0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
