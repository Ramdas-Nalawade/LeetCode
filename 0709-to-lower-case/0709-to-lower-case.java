class Solution {
    public String toLowerCase(String s) 
    {
        String ans = "";

        for(char c: s.toCharArray())
        {
            if(c >= 'A' && c <= 'Z')
                ans += (char) (c+32);
            else
                ans += c;
        }
        return ans;
    }
}