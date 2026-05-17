package Leetcode.odin;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class JumpGameIII1306 {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int curr = queue.poll();

            if(arr[curr] == 0){
                return true;
            }
            int left = curr - arr[curr];
            int right = curr + arr[curr];

            if(left >= 0 && left < arr.length && visited[left] == false){
                queue.add(left);
                visited[left] = true;
            }

            if(right >= 0 && right < arr.length && visited[right] == false){
                queue.add(right);
                visited[right] = true;
            }
        }

        return false;
    }
}
