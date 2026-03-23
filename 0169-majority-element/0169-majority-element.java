class Solution {
    public int majorityElement(int[] nums) 
    {
        int majority = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int ch = nums[i];
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.get(ch) > nums.length/2)
                return ch;
        }
        return -1;
    }
}