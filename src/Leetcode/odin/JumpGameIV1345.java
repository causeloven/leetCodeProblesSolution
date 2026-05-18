package Leetcode.odin;

import java.util.*;

public class JumpGameIV1345 {
    public int minJumps(int[] arr) {
//commit
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], new ArrayList<>());
            }
            hashMap.get(arr[i]).add(i);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        int[] dist = new int[arr.length];
        Arrays.fill(dist, -1);

        dist[0] = 0;
        queue.add(0);

        while(!queue.isEmpty()){
            int curr = queue.poll();

            if(curr == arr.length - 1){
                return dist[curr];
            }

            int left = curr - 1;
            if(left >= 0 && dist[left] == -1){
                dist[left] = dist[curr] + 1;
                queue.add(left);
            }

            int right = curr + 1;
            if(right < arr.length && dist[right] == -1){
                dist[right] = dist[curr] + 1;
                queue.add(right);
            }

            List<Integer> sameValues = hashMap.get(arr[curr]);
            if(sameValues != null){
                for(int next : sameValues){
                    if(dist[next] == -1){
                        dist[next] = dist[curr] + 1;
                        queue.add(next)
                    }
                }
                hashMap.remove(arr[curr]);
            }

        }

        return -1;
    }
}
