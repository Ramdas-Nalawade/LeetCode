class Solution {
    public int[] runningSum(int[] nums) 
    {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            int a = i;
            
            while(a >= 0)
            {
                arr[i] += nums[a];
                a--;
            }
        }
        return arr;
    }
}