class Solution {
    public int lengthOfLastWord(String s) 
    {
        String[] updatedS = s.trim().split("\\s+");
        int i = updatedS.length - 1;

        int length = updatedS[i].length();

        return length;
    }
}