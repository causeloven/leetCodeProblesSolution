package Interview150;

public class BestTimetoBuyandSellStock122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else if (prices[i] > minPrice) {
                maxProfit += prices[i] - minPrice;
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
