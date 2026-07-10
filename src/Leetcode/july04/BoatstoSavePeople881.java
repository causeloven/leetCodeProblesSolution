package Leetcode.july04;

import java.util.Arrays;

public class BoatstoSavePeople881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int count = 0;

        while(left < right){
            if(people[left] + people[right] <= limit){
                left++;
                right--;

                count++;
            }else{
                right--;
                count++;
            }
        }

        if(left == right){
            count++;
        }

        return count;
    }
}
