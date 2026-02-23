class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }        
        for(int i = 0; i < nums.length; i++)
        {
            if(map.get(nums[i]) == 1)
                nums[count++] = nums[i];

            map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
        }
        return count;
    }
}