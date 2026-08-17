class Solution {
    public int jump(int[] nums) 
    {
        int jumps = 0, farthest = 0, current = 0;

        for(int i = 0; i < nums.length - 1; i++)
        {
            farthest = Math.max(farthest, i+nums[i]);

            if(current == i)
            {
                jumps++;
                current = farthest;

                if(current >= nums.length - 1)
                    break;
            }
        }
        return jumps;
    }
}