class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int index = 0;

        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i = 0; i < nums.length; i++)
        {
            int ch = nums[i];
            if(map.get(ch) <= 2)
                nums[index++] = nums[i];
            else
                map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        return index;
    }
}