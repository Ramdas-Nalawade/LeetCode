class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        // Set<Integer> set = new HashSet<>();

        // for(int i: nums)
        // {
        //     if(set.contains(i))
        //         return true;
        //     set.add(i);
        // }
        // return false;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}