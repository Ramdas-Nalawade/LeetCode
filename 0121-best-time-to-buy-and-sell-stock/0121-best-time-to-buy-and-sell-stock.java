class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0;
        int lowestPrice = Integer.MAX_VALUE;

        for(int i: prices)
        {
            lowestPrice = lowestPrice > i ? i : lowestPrice;
            int currentProfit = i - lowestPrice;
            maxProfit = maxProfit > currentProfit ? maxProfit : currentProfit;
        }        
        return maxProfit;
    }
}