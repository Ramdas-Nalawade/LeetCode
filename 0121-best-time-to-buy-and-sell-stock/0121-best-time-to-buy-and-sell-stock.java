class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = Integer.MIN_VALUE;
        int lowestPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++)
        {
            lowestPrice = lowestPrice > prices[i] ? prices[i] : lowestPrice;
            int currentProfit = prices[i] - lowestPrice;
            maxProfit = maxProfit > currentProfit ? maxProfit : currentProfit;
        }
        return maxProfit;
    }
}