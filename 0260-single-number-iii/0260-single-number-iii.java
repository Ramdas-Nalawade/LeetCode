class Solution {
    public int[] singleNumber(int[] nums) 
    {
        int[] res = new int[2];
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i: nums)
        {
            if(map.containsKey(i) && map.get(i) == 1)
            {
                res[index++] = i;
            }
        }
        return res;
    }
}