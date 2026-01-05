class Solution {
    public int removeDuplicates(int[] nums) 
    {
        // Set<Integer> set = new HashSet<>();
        // int count = 0;

        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(!set.contains(nums[i]))
        //         nums[count++] = nums[i];
        //     set.add(nums[i]);
        // }
        // return count;

        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0;

        // for(int i = 0; i < nums.length; i++)
        // {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        //     if(map.get(nums[i]) == 1)
        //         nums[count++] = nums[i];
        // }
        // return count;

        int i = 0; 

        for(int j = 0; j < nums.length; j++)
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
