class Solution {
    public int removeElement(int[] nums, int val) 
    {
        // int count = 0;
        // Set<Integer> set = new HashSet<>();

        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(nums[i] != val)
        //         nums[count++] = nums[i];
        //     set.add(nums[i]);
        // }        
        // return count;

        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
                nums[count++] = nums[i];
        }
        return count;
    }
}