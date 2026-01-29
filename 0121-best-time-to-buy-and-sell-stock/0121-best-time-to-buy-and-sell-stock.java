class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0, lowestPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++)
        {
            lowestPrice = lowestPrice > prices[i] ? prices[i] : lowestPrice;
            int currentProfit = prices[i] - lowestPrice;
            maxProfit = maxProfit > currentProfit ? maxProfit : currentProfit;
        }
        return maxProfit;
    }
}