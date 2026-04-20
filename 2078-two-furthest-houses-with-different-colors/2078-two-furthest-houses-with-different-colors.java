class Solution 
{
    public int maxDistance(int[] colors) 
    {
        int maxDistance = 0, n = colors.length;

        for(int i = n - 1; i >= 0; i--)
        {
            if(colors[i] != colors[0])
            {
                maxDistance = i;
                break;
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(colors[i] != colors[n-1])
            {
                maxDistance = Math.max(maxDistance, n-1-i);
                break;
            }
        }
        return maxDistance;
    }
}