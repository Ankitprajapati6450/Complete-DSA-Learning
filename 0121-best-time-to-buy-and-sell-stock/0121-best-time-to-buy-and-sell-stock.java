class Solution {
    public int maxProfit(int[] prices) {
        int buying_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(buying_price < prices[i]){
                int profit = prices[i] - buying_price;
                max_profit = Math.max(max_profit , profit);
            }
            else{
                buying_price = prices[i];
            }
        }
        return max_profit;
    }
}