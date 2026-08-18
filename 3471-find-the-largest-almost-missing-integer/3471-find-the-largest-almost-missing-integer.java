class Solution {
    public int largestInteger(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int x = -1;

        for(int i = 0; i <= nums.length - k; i++)
        {
            Set<Integer> set = new HashSet<>();

            for(int j = i; j < (i+k); j++)
                set.add(nums[j]);

            for(int l: set)
                map.put(l, map.getOrDefault(l, 0) + 1);
        }
        for(int i: map.keySet())
        {
            if(map.get(i) == 1)
                x = Math.max(x, i);
        }
        return x;
    }
}