class Solution {
    public int removeDuplicates(int[] nums) 
    {
        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0;

        // for (int i : nums) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);

        //     if (map.get(i) == 1) {  
        //         nums[count++] = i;
        //     }
        // }
        // return count;

        //Another approach
        if(nums.length == 0) return 0;

        int i = 0;

        for(int j = 1; j < nums.length; j++)
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
