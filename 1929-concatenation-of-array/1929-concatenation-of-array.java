class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int[] nums2 = new int[nums.length+nums.length];
        int count = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            nums2[count] = nums[i];
            count++;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            nums2[count] = nums[i];
            count++;
        }
        return nums2;
    }
}