package Leetcode.june;

import java.util.ArrayList;
import java.util.List;

public class IntegerBreak343{
    public int integerBreak(int n) {

        if(n == 2) return 1;
        if(n == 3) return 2;

        int threes = n/3;
        int rem = n % 3;

        if(rem == 0) return (int) Math.pow(3, threes);
        if(rem == 1) return (int) Math.pow(3, threes - 1) * 4;
        return (int) Math.pow(3, threes) * 2;

    }

}
