package Leetcode.Collections.HashMap;

import java.util.HashMap;

class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (!mag.containsKey(c)) {
                return false;
            }

            mag.put(c, mag.getOrDefault(c, 0) - 1);

            if (mag.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
}
