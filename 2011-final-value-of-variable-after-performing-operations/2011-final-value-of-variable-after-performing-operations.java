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
    }
}