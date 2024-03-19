class Solution {
    public int strStr(String haystack, String needle) 
    {
        int j = needle.length();

        for(int i = 0; j <= haystack.length(); i++, j++)
        {
            if(needle.equals(haystack.substring(i, j)))
                return i;
        }     
        return -1;
    }
}