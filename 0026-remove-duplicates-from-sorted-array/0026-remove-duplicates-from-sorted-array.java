class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);

            if (map.get(n) == 1) {   // first time seen
                nums[index++] = n;
            }
        }
        return index;
    }
}
