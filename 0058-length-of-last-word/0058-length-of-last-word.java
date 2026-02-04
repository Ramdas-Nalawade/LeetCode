class Solution {
    public int lengthOfLastWord(String s) 
    {
        String trimmedS = s.trim();
        int count = 0;
        for(int i = trimmedS.length() - 1; i >= 0; i--)
        {
            char ch = trimmedS.charAt(i);
            if(ch != ' ')
                count++;
            else
                break;
        }             
        return count;   
    }
}