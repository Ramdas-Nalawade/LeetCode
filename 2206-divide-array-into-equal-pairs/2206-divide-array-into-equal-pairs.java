class Solution {
    public boolean divideArray(int[] nums) 
    {
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i: nums)        
        //     map.put(i, map.getOrDefault(i, 0) + 1);

        // for(int i: nums)
        // {
        //     if(!(map.get(i) % 2 == 0))
        //         return false;
        // }
        // return true;

        int[] freq = new int[501];

        for(int i: nums)
            freq[i]++;

        for(int i: nums)
        {
            if(freq[i] % 2 != 0)
                return false;
        }
        return true;
    }
}