class Solution {
    public int lengthOfLastWord(String s) 
    {
        String updatedS = s.trim();
        int count = 0;

        for(int i = updatedS.length() - 1; i >= 0; i--)
        {
            if(updatedS.charAt(i) == ' ')
                break;
            
            count++;
        }        
        return count;
    }
}