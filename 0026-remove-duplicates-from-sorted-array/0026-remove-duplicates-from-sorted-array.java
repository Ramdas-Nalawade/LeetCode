class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Set<Integer> set = new LinkedHashSet<>();
        int count = 0;

        for(int i: nums)
            set.add(i);

        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();

        for(int i: set)
        {
            nums[count++] = i;
        }
        return count;
    }
}