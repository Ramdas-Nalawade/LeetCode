class Solution {
    public int removeDuplicates(int[] nums) 
    {
        // Set<Integer> set = new HashSet<>();
        // int count = 0;

        // for(int i: nums)
        // {
        //     if(!set.contains(i))
        //         nums[count++] = i;
        //     set.add(i);
        // } 
        // return count;

        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0;

        // for(int i: nums)
        // {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        //     if(map.get(i) == 1)
        //         nums[count++] = i;
        // }

        // return count;

        int j = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}