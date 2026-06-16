package Leetcode.june;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        CombinationSum39 combinationSum39 = new CombinationSum39();

        int[] candies = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = combinationSum39.combinationSum(candies, target);

        for(List<Integer> list : result){
            System.out.println(list);
        }

    }
}
