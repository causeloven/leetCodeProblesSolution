package Leetcode.june;

public class MirrorDistanceofanInteger3783 {
    public int mirrorDistance(int n) {
        return n - reverse(n);
    }

    public int reverse(int n ){
        int reversed = 0;

        while (n > 0){
            reversed = (n % 10) + reversed * 10;
            n /= 10;
        }

        return reversed;
    }
}
