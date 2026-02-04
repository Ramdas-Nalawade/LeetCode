class Solution {
    public int lengthOfLastWord(String s) 
    {
        String trimmedS = s.trim();
        int count = 0;
        for(int i = trimmedS.length() - 1; i > 0; i--)
        {
            if(trimmedS.charAt(i) == ' ')
                break;
            count++;
        }             
        return count;   
    }
}