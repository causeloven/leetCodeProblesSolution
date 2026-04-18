package Leetcode.Collections.HashMap;

import java.util.HashMap;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();


        // здесь я думал взять первую строку и посчитать кол во букв в ней
        //их частотность
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);

            if (!sMap.containsKey(c)) {
                return false;
            }

            sMap.put(c, sMap.getOrDefault(c, 0) - 1);

            if (sMap.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
}
