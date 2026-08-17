class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0;

        for(int i = 0; i < prices.length - 1; i++)
        {
            int sum = prices[i+1] - prices[i];
            boolean currentProfit = sum > 0;
            if(currentProfit)
                maxProfit += sum;
        }
        return maxProfit;
    }
}