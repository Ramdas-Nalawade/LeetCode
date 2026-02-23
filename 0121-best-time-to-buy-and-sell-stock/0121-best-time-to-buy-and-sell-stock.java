class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0;
        int lowest = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++)
        {
            lowest = lowest > prices[i] ? prices[i] : lowest;
            int todaysProfit = prices[i] - lowest;
            maxProfit = maxProfit > todaysProfit ? maxProfit : todaysProfit;
        }                
        return maxProfit;
    }
}