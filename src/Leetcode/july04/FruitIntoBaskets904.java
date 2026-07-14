package Leetcode.july04;

import java.util.HashMap;

public class FruitIntoBaskets904 {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> bucket = new HashMap<>();

        int maxLength = 0;
        for(int left = 0, right = 0; right < fruits.length; right++){
            bucket.put(fruits[right],bucket.getOrDefault(fruits[right], 0)+1);

            while(bucket.size() > 2){
                bucket.put(fruits[left],bucket.getOrDefault(fruits[left],0)-1);
                if(bucket.get(fruits[left]) == 0){
                    bucket.remove(fruits[left]);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left+1);
        }

        return maxLength;
    }
}
