class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] < nums2[j])
                i++;
            
            else if(nums1[i] > nums2[j])
                j++;
            
            else
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        Object[] obj = list.toArray();
        int[] arr = new int[obj.length];
        int count = 0;
            
        for(Object o: obj)
        {
            arr[count++] = (int) o;
        }
        return arr;
    }
}