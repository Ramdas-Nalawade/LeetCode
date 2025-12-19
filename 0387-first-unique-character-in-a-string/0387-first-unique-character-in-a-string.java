class Solution {
    public int firstUniqChar(String s) 
    {
        // Map<Character, Integer> frequency = new HashMap<>();

        // for(char ch: s.toCharArray())
        // {
        //     frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        // }

        // for(int i = 0; i < s.length(); i++)
        // {
        //     if(frequency.get(s.charAt(i)) == 1)
        //         return i;
        // }
        // return -1;

        return IntStream.range(0, s.length())
        .filter(i -> s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
        .findFirst()
        .orElse(-1);
    }
}