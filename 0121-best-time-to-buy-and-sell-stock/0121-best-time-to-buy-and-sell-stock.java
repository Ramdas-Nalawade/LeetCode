class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0, lowPrice = Integer.MAX_VALUE;

        for(int i: prices)
        {
            lowPrice = Math.min(lowPrice, i);
            int currProfit = i - lowPrice;
            maxProfit = Math.max(maxProfit, currProfit);
        }
        return maxProfit;
    }
}