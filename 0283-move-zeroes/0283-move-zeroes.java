class Solution {
    public void moveZeroes(int[] nums) 
    {
        int zeroes = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
                nums[count++] = nums[i];
            else
                zeroes++;
        }
        for(int i = count; i < nums.length; i++)
        {
            nums[count++] = 0;
        }
    }
}