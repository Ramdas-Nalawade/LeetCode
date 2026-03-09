class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0, left = 0, right = 0;

        while(right < nums.length)
        {
            currentSum += nums[right];
            right++;

            while(currentSum >= target)
            {
                int currentWindowLength = right - left;
                minLength = Math.min(minLength, currentWindowLength);
                currentSum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}