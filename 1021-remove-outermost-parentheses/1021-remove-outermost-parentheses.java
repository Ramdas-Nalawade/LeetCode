class Solution {
    public String removeOuterParentheses(String s) 
    {
        int j = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                if(j > 0)
                    sb.append(ch);
                j++;
            }
            else
            {
                j--;
                if(j > 0)
                    sb.append(ch);
            }
        }        
        return sb.toString();
    }
}