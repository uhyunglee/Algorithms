class Solution {
    public int maxProfit(int[] prices) {
        int lowPrice = prices[0];
        int profit = 0;
        
        for(int price : prices){
            lowPrice = Math.min(lowPrice, price);
            profit = Math.max(profit, price - lowPrice);
        }
        
        return profit;
    }
}