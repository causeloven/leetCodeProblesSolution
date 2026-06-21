package Leetcode.june;

import java.util.Arrays;

public class MaximumIceCreamBars1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int count = 0;
        for (int price : costs) {
            if (coins >= price) {
                coins -= price;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
