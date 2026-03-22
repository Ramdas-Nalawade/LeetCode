class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int ch = nums[i];
            if(!map.containsKey(ch))
                nums[count++] = ch;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return count;
    }
}