class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int index = 0;

        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i = 0; i < nums.length; i++)
        {
            if(map.get(nums[i]) == 1)
            {
                nums[index++] = nums[i];
            }
            else
                map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
        }
        return index;
    }
}