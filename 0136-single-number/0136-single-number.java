class Solution {
    public int singleNumber(int[] nums) 
    {
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < nums.length; i++)
        // {
        //     int ch = nums[i];
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // for(int i: nums)
        //     if(map.get(i) == 1)
        //         return i;
        // return -1;

        int count = 0;

        for(int i: nums)
        {
            count ^= i;
        }
        return count;
    }
}