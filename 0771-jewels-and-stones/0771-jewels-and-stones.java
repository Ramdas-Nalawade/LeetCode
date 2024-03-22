class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count = 0;

        for(char ch: stones.toCharArray())
        {
            for(char ch1: jewels.toCharArray())
            {
                if(ch == ch1)
                    count++;
            }
        }        
        return count;
    }
}