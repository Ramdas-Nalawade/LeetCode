class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        // if(nums1.length > nums2.length)
        //     return intersect(nums2, nums1);

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i: nums1)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i: nums2)
        {
            if(map.getOrDefault(i, 0) > 0)
            {
                list.add(i);
                map.put(i, map.getOrDefault(i, 0) - 1);
            }
        }
        int[] finalArray = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            finalArray[i] = list.get(i);
        }
        return finalArray;
    }
}