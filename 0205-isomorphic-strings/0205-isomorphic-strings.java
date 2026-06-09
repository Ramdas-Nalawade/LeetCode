class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);

            if(!map.containsKey(ch))
                map.put(ch, i);
            
            if(!map2.containsKey(ch2))
                map2.put(ch2, i);

            if(!map.get(ch).equals(map2.get(ch2)))
                return false;
        }
        return true;
    }
}