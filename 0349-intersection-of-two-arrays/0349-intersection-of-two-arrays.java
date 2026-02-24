class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        // Map<Integer, Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();

        // for(int i: nums1)
        //     map.put(i, map.getOrDefault(i, 0) + 1);

        // for(int i: nums2)
        // {
        //     if(map.getOrDefault(i, 0) > 0)
        //     {
        //         if(!list.contains(i))
        //         list.add(i);
        //         map.put(i, map.getOrDefault(i, 0) - 1);
        //     }
        // }
        // int[] arr = new int[list.size()];

        // for(int i = 0; i < list.size(); i++)
        //     arr[i] = list.get(i);

        // return arr;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i: nums1)
            set1.add(i);

        for(int i: nums2)
            if(set1.contains(i))
                set2.add(i);

        int[] arr = new int[set2.size()];
        int i = 0;

        for(int j: set2)
        {
            arr[i++] = j;
        }
        return arr;
    }
}