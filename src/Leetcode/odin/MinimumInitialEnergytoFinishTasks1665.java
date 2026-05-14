package Leetcode.odin;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumInitialEnergytoFinishTasks1665 {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0])- (a[1] - a[0]));

        int totalEnergy = 0;
        int currentEnergy = 0;

        for(int[] task : tasks){
            int actual = task[0];
            int minimum = task[1];

            if(currentEnergy < minimum){
                int needed = minimum - currentEnergy;
                totalEnergy += needed;
                currentEnergy += needed;
            }
            currentEnergy -= actual;
        }


        if(totalEnergy < 0){
            totalEnergy *= -1;
        }

        return totalEnergy;
    }
}
