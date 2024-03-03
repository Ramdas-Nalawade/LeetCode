class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        String a = x+"";
        
        for(String s: words)
        {
            if(s.contains(a))
            {
                list.add(count);
            }
            count++;
        }
        return list;
        
    }
}