class Solution {
    public int strStr(String haystack, String needle) 
    {
        if(!haystack.contains(needle) || needle.length() > haystack.length())
            return -1;

        for(int i = 0; i <= haystack.length() - needle.length(); i++)
        {
            int j = 0;

            while(j < needle.length() &&
             haystack.charAt(i+j) == needle.charAt(j))
             j++;


            if(needle.length() == j)
                return i;
        }

        return -1;
    }
}