class Solution {
    public int trap(int[] height) 
    {
        int l = 0;
        int r = height.length-1;
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int h20 = 0;

        while(l < r)
        {
            if(leftMax < rightMax)
            {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                h20 += leftMax - height[l];
            }
            else
            {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                h20 += rightMax - height[r];
            }
        }
        return h20;
    }
}