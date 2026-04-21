package Interview150;

public class BestTimetoBuyandSellStock121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] > minPrice){
                int profit = prices[i] - minPrice;
                if(maxProfit < profit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}


