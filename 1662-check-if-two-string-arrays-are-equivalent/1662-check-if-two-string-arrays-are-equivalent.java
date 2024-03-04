class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String str = "";
        String str2 = "";
        
        for(String s: word1)
            str += s;
        
        for(String s: word2)
            str2 += s;
        
        if(str.equals(str2))
            return true;
        return false;
    }
}