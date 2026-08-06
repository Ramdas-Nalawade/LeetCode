class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count = 0;

        // for(char ch: jewels.toCharArray())
        // {
        //     for(char c: stones.toCharArray())
        //     {
        //         if(ch == c)
        //             count++;
        //     }
        // }
        // return count;

        Map<Character, Integer> map = new HashMap<>();

        for(char ch: jewels.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for(char c: stones.toCharArray())
        {
            if(map.containsKey(c) && map.get(c) >= 1)
                count++;
        }
        return count;
    }
}