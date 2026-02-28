class Solution {
    public int maxProfit(int[] prices) 
    {
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            lowestPrice = lowestPrice < prices[i] ? lowestPrice : prices[i];
            int currentProfit = prices[i] - lowestPrice;
            maxProfit = maxProfit > currentProfit ? 
                        maxProfit : currentProfit;
        }        
        return maxProfit;
    }
}