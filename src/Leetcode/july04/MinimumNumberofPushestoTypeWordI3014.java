package Leetcode.july04;

public class MinimumNumberofPushestoTypeWordI3014 {
    public int minimumPushes(String word) {
        int n = word.length();
        int q = n / 8;
        int r = n % 8;
        return 8 * q * (q + 1) / 2 + r * (q + 1);
    }
}
