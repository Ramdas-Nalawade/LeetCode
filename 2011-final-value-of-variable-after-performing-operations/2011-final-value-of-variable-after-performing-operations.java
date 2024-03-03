class Solution {
    public int finalValueAfterOperations(String[] operations) 
    {
        int a = 0;
        
        for(String s: operations)
        {
            if(s.equals(("++X")))
                ++a;
            if(s.equals(("X++")))
                a++;
            if(s.equals(("--X")))
                --a;
            if(s.equals(("X--")))
                a--;                
        }
        return a;
        // int a = 0;
        // for(int i = 0; i < operations.length; i++)
        // {
        //     if(str[i].equalsIgnoreCase("++X"))
        //         ++i;
        //     if(ch.equals("X++"))
        //         i++;
        //     if(ch.equals("--X"))
        //         --i;
        //     if(ch.equals("X--"))
        //         i--;
        // }
        // return i;
    }
}