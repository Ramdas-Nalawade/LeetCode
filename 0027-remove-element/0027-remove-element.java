class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int count = 0;
        int index = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                count++;
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i = count; i < nums.length; i++)
        {
            nums[i] = 0;
        }
        return count;
    }
}