class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0;
        int lowest = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++)
        {
            lowest = lowest < prices[i] ? lowest : prices[i];
            int currentProfit = prices[i] - lowest;
            maxProfit = maxProfit > currentProfit ? 
                        maxProfit : currentProfit;
        }
        return maxProfit;
    }
}