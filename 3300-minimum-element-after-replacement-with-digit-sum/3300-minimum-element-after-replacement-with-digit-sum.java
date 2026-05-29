class Solution {
    public int minElement(int[] nums) 
    {
        int minEle = Integer.MAX_VALUE, count = 0;

        for(int i: nums)
        {
            int sum = 0;
            while(i  > 0)
            {
                int temp = i % 10;
                sum += temp;
                i /= 10;
            }
            nums[count++] = sum;
            minEle = Math.min(minEle, sum);
        }        
        return minEle;
    }
}