package Leetcode.june;

public class ReachaNumber754 {
    public int reachNumber(int target) {
        if(target == 0) return 0;

        int sum = 0;
        int step = 1;

        target = Math.abs(target);

        while (true){
            sum += step;

            if(sum >= target && (sum-target) % 2 == 0){
                return step;
            }else {
                step++;
            }
        }
    }
}
