class Solution {
    public int[] buildArray(int[] nums) 
    {
        int[] arr = new int[nums.length];
        
        for(int i: nums)
        {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}