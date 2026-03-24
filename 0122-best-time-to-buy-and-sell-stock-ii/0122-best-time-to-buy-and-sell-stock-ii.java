class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0;
        int lowestPrice = Integer.MAX_VALUE;

        for(int i = 1; i < prices.length; i++)
        {
            int current  = 0;
            if(prices[i] > prices[i-1])
            {
                current = (prices[i-1] - prices[i]) * -1;
                maxProfit += current;
            }
        }
        return maxProfit;
    }
}