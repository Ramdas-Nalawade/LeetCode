class Solution {
    public String removeOuterParentheses(String s) 
    {
        //when depth becomes 1 → 0 or 0 → 1,
        //we know we are crossing the outer wall → skip those parentheses.
        int depth = 0;
        StringBuilder result = new StringBuilder();

        for(char ch: s.toCharArray())
        {
            if(ch == '(')
            {
                if(depth > 0)
                    result.append(ch);
                depth++;
            }
            else
            {
                depth--;
                if(depth > 0)
                    result.append(ch);
            }
        }    
        return result.toString();    
    }
}