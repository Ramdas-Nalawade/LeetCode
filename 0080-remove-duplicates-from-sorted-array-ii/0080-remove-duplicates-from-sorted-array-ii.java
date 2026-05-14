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