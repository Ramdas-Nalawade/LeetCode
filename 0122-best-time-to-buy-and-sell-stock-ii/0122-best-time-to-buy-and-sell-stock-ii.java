class Solution {
    public int maxProfit(int[] prices) 
    {
        int lowestPrice = Integer.MAX_VALUE;
        int totalProfit = 0;

        for(int i = 0; i < prices.length - 1; i++)
        {
            int currentProfit = prices[i+1] - prices[i];
            if(currentProfit > 0)
                totalProfit += currentProfit;
        }        
        return totalProfit;
    }
}