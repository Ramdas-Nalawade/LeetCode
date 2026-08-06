class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int count = 0;
        // Set<Integer> set = new LinkedHashSet<>();

        // for(int i: nums)
        //     set.add(i);

        // for(int i: set)
        // {
        //     nums[count++] = i;
        // }
        // return count;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
        {
            if(!map.containsKey(i))
                nums[count++] = i;
            map.put(i, 0);
        }
        return count;
    }
}