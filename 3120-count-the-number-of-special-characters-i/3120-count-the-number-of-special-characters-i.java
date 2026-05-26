class Solution {
    public int numberOfSpecialChars(String word) 
    {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for(char ch: word.toCharArray())        
        {
            set.add(ch);
        }

        for(char i = 'A'; i <= 'Z'; i++)
        {
            if(set.contains(i) && set.contains((char)(i - 'A' + 'a')))
                count++;
        }
        return count;
    }
}