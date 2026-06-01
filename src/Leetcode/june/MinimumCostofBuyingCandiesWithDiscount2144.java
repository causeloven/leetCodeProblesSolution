package Leetcode.june;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class MinimumCostofBuyingCandiesWithDiscount2144 {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int i = 0;
        int j = cost.length - 1;
        while(i < j){
            int temp = cost[i];
            cost[i] = cost[j];
            cost[j] = temp;
            i++;
            j--;
        }

        int total = 0;

        for(int g = 0; g < cost.length; g++){
            if(g % 3 == 2){
                continue;
            }else {
                total += cost[g];
            }
        }

        return total;

    }
}
