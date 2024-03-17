class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) 
    {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++)
        {     
            if(i == 0)
                list.add(words[i]);
            else if(groups[i] != groups[i-1])
                list.add(words[i]);          
        }   
        return list;     
    }
}