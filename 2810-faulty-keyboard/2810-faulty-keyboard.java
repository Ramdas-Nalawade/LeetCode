class Solution {
    public String finalString(String s) 
    {
        String str = "";
        StringBuilder sb = new StringBuilder(s);
        
        for(char ch: s.toCharArray())
        {
            if(ch == 'i')
            {
                str = sb.reverse()+"";
            }
            else
                str += "" + ch;
                sb = new StringBuilder(str);
        }
        return str;
    }
}