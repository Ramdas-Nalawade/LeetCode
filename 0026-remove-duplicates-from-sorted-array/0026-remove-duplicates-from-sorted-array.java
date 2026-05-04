class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
                nums[count++] = nums[i];
            map.put(nums[i], 0);
        }
        return count;
    }
}