class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int count = 0;

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
        int[]arr = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            arr[count++] = list.get(i);
        }
        return arr;
    }
}