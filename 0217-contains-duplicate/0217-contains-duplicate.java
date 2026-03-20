class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int ch = nums[i];
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.get(ch) >= 2)
                return true;
        }
        return false;
    }
}