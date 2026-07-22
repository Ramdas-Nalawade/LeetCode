class Solution {
    public int hIndex(int[] citations) 
    {
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++)
        {
            int hIndex = citations.length - i;
            if(citations[i] >= citations.length - i)
                return hIndex;
        }
        return 0;
    }
}