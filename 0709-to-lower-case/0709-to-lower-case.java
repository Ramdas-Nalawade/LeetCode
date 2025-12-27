class Solution {
    public String toLowerCase(String s) 
    {
        String lower = "";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                lower += (char)(ch+32);
            else    
                lower += ch;
        }
        return lower;
    }
}