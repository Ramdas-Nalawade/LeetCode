class Solution {
    public int[] numberGame(int[] nums) 
    {
        // int[] arr = new int[nums.length];
        Arrays.sort(nums);
        
        // for(int i = 0; i < arr.length; i++)
        // {
        //     arr[i] = nums[i];
        // }
        
        for(int i = 0; i < nums.length - 1; i = i + 2)
        {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}