class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);

            if (map.get(i) == 1) {  
                nums[count++] = i;
            }
        }
        return count;
    }
}
