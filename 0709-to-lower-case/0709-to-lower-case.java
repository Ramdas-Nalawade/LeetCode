class Solution {
    public String toLowerCase(String s) 
    {
        String ans = "";

        for(Character ch: s.toCharArray())
        {
            if(ch >= 'A' && ch <= 'Z')
                ans += (char) (ch+32);
            else                
                ans += ch;
        }
        return ans;
    }
}