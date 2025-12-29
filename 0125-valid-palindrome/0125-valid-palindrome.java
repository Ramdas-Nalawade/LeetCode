class Solution {
    public boolean isPalindrome(String s) 
    {
       String updatedS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverseUpdatedS = "";

        for(int i = updatedS.length() - 1; i >= 0; i--)
        {
            reverseUpdatedS += updatedS.charAt(i);
        }        
        return updatedS.equals(reverseUpdatedS);
    }
}