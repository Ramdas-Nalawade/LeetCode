class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i: nums1)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i: nums2)
        {
            if(map.getOrDefault(i, 0) > 0)
            {
                list.add(i);
                map.put(i, map.getOrDefault(i, 0) - 1);
            }
        }
        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
        // return list.stream().mapToInt(Integer::intValue).toArray();
    }
}