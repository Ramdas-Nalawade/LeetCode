class Solution {
    public int majorityElement(int[] nums) 
    {
        // int majority = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) > nums.length/2)
                return i;
        }    
        return -1;
    }
}