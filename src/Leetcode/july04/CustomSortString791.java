package Leetcode.july04;

public class CustomSortString791 {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for(char c : order.toCharArray()){
            int count = freq[c - 'a'];
            while (count > 0){
                sb.append(c);
                count--;
            }

            freq[c - 'a'] = 0;
        }

        for(char c = 'a'; c <= 'z'; c++){
            int count = freq[c - 'a'];
            while(count > 0){
                sb.append(c);
                count--;
            }
        }

        return sb.toString();
    }
}
