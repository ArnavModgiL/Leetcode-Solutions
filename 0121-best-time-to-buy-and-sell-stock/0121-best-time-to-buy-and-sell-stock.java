class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minprice) {
                minprice = prices[i];
            } if(profit < prices[i] - minprice){
                profit = prices[i] - minprice;
            }
        } return profit;
    }
}