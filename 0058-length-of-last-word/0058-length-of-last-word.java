class Solution {
    public int lengthOfLastWord(String s) 
    {
        String upS = s.trim();
        int count = 0;

        for(int i = upS.length() - 1; i >= 0; i--)
        {
            if(upS.charAt(i) == ' ')
                break;
            count++;
        }
        return count;
    }
}