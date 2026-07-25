package Leetcode.july04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumProductofTwoDigits3536 {
    public int maxProduct(int n) {
        List<Integer> arr = new ArrayList<>();

        while(n > 0){
            arr.add(n%10);
            n/=10;
        }

        arr.sort((a,b)-> a - b);

        if(arr.size() >= 2){
            return arr.get(arr.size()-1) * arr.get(arr.size()-2);
        }

        return arr.get(arr.size()-1);


    }
}
