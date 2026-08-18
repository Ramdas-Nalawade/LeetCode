class Solution {
    public int missingNumber(int[] nums) 
    { 
        // Map<Integer, Integer> map = new LinkedHashMap<>();
        // int curr = 1;

        // for(int i: nums)
        //     map.put(i, map.getOrDefault(i, 0) + 1);

        // for(int i = 1; i <= nums.length; i++)
        // {
        //     if(!map.containsKey(i))
        //         return i;
        // }
        // return 0;

        // Arrays.sort(nums);
        // int curr = 1;

        // for(int i = 1; i < nums.length; i++)
        // {
        //     if(nums[curr++] != i)
        //         return i;
        // }
        // return 0;

        int n = nums.length;
        int sum = (n * (n+1)) /2;
        int actualSum = 0;

        for(int i: nums)
            actualSum += i;

        return sum - actualSum;

    }
}