class Solution {
    public boolean isAcronym(List<String> words, String s) 
    {
        String str = "";

        for(String st: words)
        {
            str += st.charAt(0);
        }        
        return str.equals(s);
    }
}