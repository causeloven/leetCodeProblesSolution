package Leetcode.june;

public class WaterBottles1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrink = numBottles;
        int empty = numBottles;

        while(empty >= numExchange){
            int newFull = empty / numExchange;

            totalDrink += newFull;

            empty = empty % numExchange + newFull;
        }

        return totalDrink;
    }
}
