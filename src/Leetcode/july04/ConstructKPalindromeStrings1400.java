package Leetcode.july04;

public class ConstructKPalindromeStrings1400 {
    public boolean canConstruct(String s, int k) {
        int n = s.length();

        if(n < k) return false;

        if(k == 0) return s.isEmpty();

        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        int oddCount = 0;
        for(int count : freq){
            if(count % 2 == 1){
                oddCount++;
            }
        }

        return oddCount <= k;
    }
}
