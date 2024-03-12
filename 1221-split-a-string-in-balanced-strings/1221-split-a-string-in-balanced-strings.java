class Solution {
    public int balancedStringSplit(String s) 
    {
        int max = 0;
        int count = 0;

        for(char ch: s.toCharArray())
        {
            if(ch == 'R')
                count++;
            if(ch == 'L')
                count--;
            if(count == 0)
                max++;
        }        
        return max;
    }
}