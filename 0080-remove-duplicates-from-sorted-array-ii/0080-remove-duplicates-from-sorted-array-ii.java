class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
        {
            if(map.getOrDefault(i, 0) < 2)
            {
                map.put(i, map.getOrDefault(i, 0) + 1);
                nums[index++] = i;
            }
        }
        return index;
    }
}
        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0;

        // for(int i: nums)
        //     map.put(i, map.getOrDefault(i, 0) + 1);

        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(map.get(nums[i]) <= 2)
        //     {
        //         nums[count++] = nums[i];
        //     }
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
        // }
        // return count;

        // int k = 2;

        // for(int i = 2; i < nums.length; i++)
        // {
        //     if(nums[i] != nums[k-2])
        //     {
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        // return k;