class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int[] arr = new int[nums.length];
        int a = 1;
        int z = nums.length - 2;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0)
            {
                while(a < nums.length)
                {
                    arr[i] += nums[a];
                    a++;
                }
            }
            if(i == nums.length - 1)
            {
                while(z >= 0)
                {
                    arr[i] += nums[z];
                    z--;
                }
            }
            else
            {
                int left = 0;
                int l = i - 1, r = i + 1;
                int right = 0;
                
                while(l >= 0)
                {
                    left += nums[l];
                    l--;
                }
                while(r < nums.length)
                {
                    right += nums[r];
                    r++;
                }
                
                arr[i] = left - right;
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(arr[i] < 0)
            {
                arr[i] = arr[i] * (-1);
            }
        }
        return arr;
    }
}