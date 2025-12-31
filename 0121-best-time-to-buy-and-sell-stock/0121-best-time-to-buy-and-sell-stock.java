class Solution {
    public int maxProfit(int[] prices) 
    {
        int lowestPrice = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++)
        {
            lowestPrice = (lowestPrice > prices[i] ? prices[i] : lowestPrice);
            int temp = prices[i] - lowestPrice;
            profit = (profit > temp ? profit : temp);
        }
        return profit;
    }
}