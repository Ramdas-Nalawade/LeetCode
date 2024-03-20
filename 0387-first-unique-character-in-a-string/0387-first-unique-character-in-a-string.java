class Solution {
    public int firstUniqChar(String s) 
    {
        int[] arr = new int[26];

        for(char ch: s.toCharArray())
        {
            arr[ch - 'a']++;
        }        
        int i = 0;
        for(char ch: s.toCharArray())
        {
            if(arr[ch - 'a'] == 1)
                return i;
                i++;
        }
        return -1;
    }
}