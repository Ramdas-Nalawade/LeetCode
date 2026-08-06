class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0, lowest = Integer.MAX_VALUE;

        for(int i: prices)
        {
            lowest = lowest > i ? i : lowest;
            int currentProfit = i - lowest;
            maxProfit = maxProfit > currentProfit ? maxProfit : currentProfit;
        }
        return maxProfit;
    }
}