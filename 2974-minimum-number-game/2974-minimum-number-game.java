class Solution {
    public int[] numberGame(int[] nums) 
    {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = nums[i];
        }
        
        for(int i = 0; i < arr.length - 1; i = i + 2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}