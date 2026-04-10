package GasStation;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        //Output: 3
        Main main = new Main();
        System.out.println(main.Solution(gas,cost));

    }

    public int Solution(int[] gas, int[] cost) {
        if(Arrays.stream(gas).sum() < Arrays.stream(cost).sum()){
            return -1;
        }

        int[] diff = new int[gas.length];

        for(int i = 0; i < diff.length; i++){
            diff[i] = gas[i] - cost[i];
        }

        int startIndex = 0;
        int currentTank = 0;
        for(int j = 0; j < diff.length; j++){
            currentTank = currentTank + diff[j];
            if(currentTank<0){
                startIndex=j+1;
                currentTank = 0;
            }
        }
        return startIndex;
    }
}
