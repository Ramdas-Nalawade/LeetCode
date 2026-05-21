class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) 
    {
        int maxLength = 0;

        Set<Integer> set = new HashSet<>();

        for(int i: arr1)
        {
            while(i > 0)
            {
                set.add(i);
                i /= 10;
            }
        }
        
        for(int i: arr2)
        {
            int current = i;

            while(current > 0)
            {
                if(set.contains(current))
                {
                    maxLength = Math.max(maxLength, 
                                    String.valueOf(current).length());
                    break;
                }
                current /= 10;
            }
        }
        return maxLength;
    }
}