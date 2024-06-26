class Solution {
    public int maxProfit(int[] prices) {
        int high = 0, low = prices[0];
        
        for(int price : prices){
            low = Math.min(low, price);
            high = Math.max(high, price - low);
        }
        return high;
    }
}