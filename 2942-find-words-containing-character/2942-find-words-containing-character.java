class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        // List<Integer> list = new ArrayList<>();
        // int count = 0;
        // String st = ""+x;

        // for(String s: words)
        // {
        //     if(s.contains(st))
        //         list.add(count);
        //     count++;
        // }        
        // return list;

        List<Integer> list = new ArrayList<>();
        String st = ""+x;

        for(int i = 0; i < words.length; i++)
        {
            if(words[i].contains(st))
                list.add(i);
        }
        return list;
    }
}