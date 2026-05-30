class Solution {
    public String reverseWords(String s) 
    {
        String[] uS = s.trim().split("\\s+");
        String sb = "";

        for(int i = uS.length - 1; i >= 0; i--)
        {
            sb += uS[i] + " ";
        }
        return sb.trim();
    }
}