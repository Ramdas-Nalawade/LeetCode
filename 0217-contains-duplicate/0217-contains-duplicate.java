class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i: nums)
        // {
        //     map.put(i, map.getOrDefault(i, 0) + 1);

        //     if(map.get(i) == 2)
        //         return true;
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