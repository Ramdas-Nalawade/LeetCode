class Solution {
    public int hIndex(int[] citations) 
    {
        // for(int i = 0; i < citations.length; i++)
        // {
        //     for(int j = 0; j < citations.length - 1 - i; j++)
        //     {
        //         if(citations[j] > citations[j+1])
        //         {
        //             int temp = citations[j];
        //             citations[j] = citations[j+1];
        //             citations[j+1] = temp;
        //         }
        //     }
        // }
        Arrays.sort(citations);
        int n = citations.length;

        for(int i = 0; i < citations.length; i++)
        {
            int h = n - i;
            if(citations[i] >= h)
                return h;
        }
        return 0;
    }
}