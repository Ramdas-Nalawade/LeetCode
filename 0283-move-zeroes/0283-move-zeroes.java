class Solution {
    public void moveZeroes(int[] nums) 
    {
        int count = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                count++;
                continue;
            }
            nums[index] = nums[i];
            index++;
        }
        
        for(int i = 0; i < count; i++)
        {
            nums[index] = 0;
            index++;
        }
    }
}