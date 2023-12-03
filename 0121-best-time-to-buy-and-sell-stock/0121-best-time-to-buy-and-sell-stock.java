class Solution {
    public int maxProfit(int[] prices) 
    {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        
        if(prices.length == 0 || prices.length == 1)
        {
            return 0;
        }
        
        for(int i = 0; i < prices.length; i++)
        {
            buy = Math.min(buy, prices[i]);
            int profit = prices[i] - buy;
            sell = Math.max(sell,profit);
        }
        return sell;
        
    }
}