class Solution {
    public int maxProfit(int[] prices) 
    {
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            lowestPrice = (lowestPrice > prices[i] ? prices[i] : lowestPrice);
            int todaysProfit = prices[i] - lowestPrice;
            maxProfit = (maxProfit > todaysProfit ? maxProfit : todaysProfit);
        }
        return maxProfit;
    }
}