package Leetcode.May;

import java.util.Arrays;

public class DestroyingAsteroids2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long count = mass;

        for(int i = 0; i < asteroids.length; i++){
            if(count >= asteroids[i]){
                count += asteroids[i];
            }else{
                return false;
            }
        }

        return true;
    }
}
