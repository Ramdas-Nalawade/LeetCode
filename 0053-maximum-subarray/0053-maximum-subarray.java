class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxSum = 0;
        int currentSum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            currentSum = Math.max(nums[i]+currentSum, nums[i]);
            maxSum = maxSum > currentSum ? maxSum : currentSum;
        }
        return maxSum;
    }
}