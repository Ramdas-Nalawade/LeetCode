class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxSum = nums[0], currentSum = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            currentSum = max(nums[i], nums[i]+currentSum);
            maxSum = max(maxSum, currentSum);
        }
        return maxSum;
    }
    private int max(int a, int b)
    {
        if(a > b)
            return a;
        else
            return b;
    }
}