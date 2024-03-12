class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int count = 0;
        
        for(String s: words)
        {
            boolean flag = true;
            for(char a: s.toCharArray())
            {
                if(!allowed.contains(String.valueOf(a)))
                    flag = false;
            }
            if(flag)
                count++;
        }
        return count;
    }
}