class Solution {
    public int mostWordsFound(String[] sentences) 
    {       
        int max = 0;
        int count = 0;
        
        for(String s: sentences)
        {
            count = s.split(" ").length;
            if(max < count)
            max = count;
        }
        
        return max;
    }
}