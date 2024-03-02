class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        // Arrays.sort(nums);
        int[] num2 = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            num2[i] = nums[i] * nums[i];
        }
        Arrays.sort(num2);
        return num2;
    }
}