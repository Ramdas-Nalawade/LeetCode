class Solution {
    public int lengthOfLastWord(String s) 
    {
        int count = 0;
        String updateS = s.trim();

        for(int i = updateS.length() - 1; i >= 0; i--)
        {
            if(updateS.charAt(i) == ' ')
                break;
            count++;
        }        
        return count;
    }
}