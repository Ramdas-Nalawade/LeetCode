class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int ch = nums[i];
            if(!map.containsKey(ch))
                nums[count++] = nums[i];
            map.put(ch, 0);
        }
        return count;
    }
}