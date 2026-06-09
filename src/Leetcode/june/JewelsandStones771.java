package Leetcode.june;

import java.util.HashSet;

public class JewelsandStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> collection = new HashSet<>();

        for(int i = 0; i < jewels.length(); i++){
            collection.add(jewels.charAt(i));
        }

        int counter = 0;
        for(int i = 0; i < stones.length(); i++){
            if(collection.contains(stones.charAt(i))){
                counter++;
            }
        }

        return counter;
    }
}
