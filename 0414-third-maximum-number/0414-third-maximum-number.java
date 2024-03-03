class Solution {
    public int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
        int count = 1;
        int flag = 0;
        
        for(int i = nums.length - 1; i > 0; i--)
        {
            if(nums[i] == nums[i - 1])
                flag++;
            
            else
                count++;
            
            if(count == 3)
                return nums[nums.length - count - flag];
        }
        return nums[nums.length - 1];
    }
}