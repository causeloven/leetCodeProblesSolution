package Leetcode.odin;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumJumpstoReachEndviaPrimeTeleportationMediumTopics3629 {
    public int minJumps(int[] nums) {
        int n = nums.length;

        int[] distance = new int[n];
        Arrays.fill(distance, -1);

        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        distance[0] = 0;

        while(!q.isEmpty()){
            int current = q.poll();

            if(current  == n - 1){
                return distance[current];
            }

            if(current + 1 < n && distance[current+1] == -1){
                distance[current + 1] = distance[current] + 1;
                q.offer(current + 1);
            }

            if (current - 1 >= 0 && distance[current-1] == -1){
                distance[current - 1] = distance[current] + 1;
                q.offer(current - 1);
            }

            if(isPrime(nums[current])){
                for (int i = 0; i < n; i++){
                    if(distance[current] == - 1 && nums[i] % distance[current] == 0){
                        distance[i] = distance[current] + 1;
                        q.offer(i);
                    }
                }

            }

        }
        return -1;
    }

    public static boolean isPrime(int n){
        if( n <= 1 ) return false;
        if( n == 2 || n == 3 ) return true;
        if( n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0 ) return false;
        }

        return true;
    }
}
