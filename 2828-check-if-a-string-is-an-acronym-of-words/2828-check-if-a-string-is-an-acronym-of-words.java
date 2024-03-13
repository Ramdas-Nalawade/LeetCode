class Solution {
    public boolean isAcronym(List<String> words, String s) 
    {
        String str = "";
        int i = 0;

        for(String st: words)
        {
            str += st.charAt(i);
        }        
        if(str.equals(s))
            return true;
        return false;
    }
}