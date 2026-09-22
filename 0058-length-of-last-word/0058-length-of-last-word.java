class Solution {
    public int lengthOfLastWord(String s) 
    {
        int length = 0;
        String us = s.trim();

        for(int i = us.length() - 1; i >= 0; i--)
        {
            if(us.charAt(i) == ' ')
                break;
            length++;
        }
        return length;
    }
}