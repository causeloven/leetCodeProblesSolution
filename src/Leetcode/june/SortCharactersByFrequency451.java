package Leetcode.june;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortCharactersByFrequency451 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        ArrayList<Character> symbols = new ArrayList<>(map.keySet());
        Collections.sort(symbols, (a,b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c : symbols){
            int count = map.get(c);
            for(int i = 0; i < count; i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
