class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        // Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        // for(char ch: jewels.toCharArray())
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);

        // for(int i = 0; i < stones.length(); i++)
        // {
        //     char ch = stones.charAt(i);
        //     if(map.containsKey(ch))
        //         count++;
        // }
        // return count;

        for(char ch: jewels.toCharArray())
        {
            for(char c: stones.toCharArray())
            {
                if(ch == c)
                    count++;
            }
        }
        return count;
    }
}