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

        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length - 1; i++)
        // {
        //     if(nums[i] == nums[i+1])
        //         return true;
        // }
        // return false;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(map.get(nums[i]) >= 2)
                return true;
        }
        return false;

    }
}