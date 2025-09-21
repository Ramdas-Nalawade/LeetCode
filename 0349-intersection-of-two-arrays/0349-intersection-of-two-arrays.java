class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0;
        List<Integer> list = new ArrayList<>();

        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] > nums2[j])
                j++;
            else if(nums1[i] < nums2[j])
                i++;
            else
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }        
        return list.stream().distinct().mapToInt(Integer::intValue).
                    toArray();
    }
}