class Solution {
    public int lengthOfLastWord(String s) 
    {
        String uS = s.trim();
        int length = 0;

        for(int i = uS.length() - 1; i >= 0; i--)
        {
            if(uS.charAt(i) == ' ')
                break;
            else
                length++;
        }
        return length;
    }
}