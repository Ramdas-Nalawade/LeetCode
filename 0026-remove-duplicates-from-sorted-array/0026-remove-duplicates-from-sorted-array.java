class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int count = 0;
        Set<Integer> set = new LinkedHashSet<>();

        for(int i: nums)
            set.add(i);

        // int[] arr = set.stream().mapToInt(Integer::intValue).toArray();

        for(int i: set)
        {
            nums[count++] = i;
        }
        return count;
    }
}