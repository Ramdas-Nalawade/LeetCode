class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max = 0;
        int count = 0;
        
        for(int i: nums)
        {
            if(i == 0)
            {
                if(max < count)
                {
                    max = count;
                }
                count = 0;
            }
            else
            {
                count++;
            }
        }
        return max > count ? max: count;
    }
}