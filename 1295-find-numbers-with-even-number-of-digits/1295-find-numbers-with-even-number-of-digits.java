class Solution {
    public int findNumbers(int[] nums) 
    {
        int count = 0;

        for(int i: nums)
        {
            int current = 0;

            while(i > 0)
            {
                i = i/10;
                current++;
            }
            if(current % 2 == 0)
                count++;
        }
        return count;        
    }
}