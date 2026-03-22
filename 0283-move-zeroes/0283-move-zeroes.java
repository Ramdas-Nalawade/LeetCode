class Solution {
    public void moveZeroes(int[] nums) 
    {
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int ch = nums[i];
            if(ch != 0)
                nums[count++] = ch;
        }
        for(int i = count; i < nums.length; i++)
        {
            nums[count++] = 0;
        }
    }
}