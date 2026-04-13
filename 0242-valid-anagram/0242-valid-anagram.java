class Solution {
    public boolean isAnagram(String s, String t) 
    {
        // if(s.length() != t.length())
        //     return false;

        // Map<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
            

        // for(int i = 0; i < s.length(); i++)
        // {
        //     char ch = t.charAt(i);
        //     if(!map.containsKey(ch) || map.get(ch) == 0)
        //         return false;
        //     map.put(ch, map.getOrDefault(ch, 0) - 1);
        // }
        // return true;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }
}