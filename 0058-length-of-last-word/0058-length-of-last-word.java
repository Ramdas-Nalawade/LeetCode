class Solution {
    public int lengthOfLastWord(String s) 
    {
        String str = s.trim();
        
        int val = str.lastIndexOf(" ");
        
        int count = 0;
        
        for(int i = val; i < str.length(); i++)
        {
            count++;
        }
        return count-1;
    }
}