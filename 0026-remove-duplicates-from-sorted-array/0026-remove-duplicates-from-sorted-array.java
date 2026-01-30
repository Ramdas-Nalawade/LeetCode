class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for(int i: nums)
        {
            if(!set.contains(i))
                nums[count++] = i;
            set.add(i);
        } 
        return count;
    }
}