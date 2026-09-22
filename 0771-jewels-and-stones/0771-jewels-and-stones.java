class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(char c: jewels.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for(char c: stones.toCharArray())
        {
            if(map.containsKey(c))
                count++;
        }
        return count;
    }
}