class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] answer = new int[2];
        for(int i = 0; i < nums.length-1; i++)
        {
            int j = 0;

            for(int k = i+1; k < nums.length; k++)
            {
                if((nums[i]+nums[k]) == target)
                {
                    answer[j] = i;
                    answer[j+1] = k;
                    j++;
                }
            }
        }        
        return answer;
    }
}