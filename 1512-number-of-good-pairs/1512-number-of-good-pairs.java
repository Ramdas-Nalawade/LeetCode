class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        int count = 0;
        int[] arr = new int[101];
        
        for(int i: nums)
        {
            arr[i]++;
        }
        for(int i: arr)
        {
            count += (i * (i - 1))/2;
        }
        return count;
    }
}