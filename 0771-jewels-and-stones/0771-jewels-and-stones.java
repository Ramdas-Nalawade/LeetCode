class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < jewels.length(); i++)
        {
            char c = jewels.charAt(i);
            map.put(c, 0);
        
        }

        for(int i = 0; i < stones.length(); i++)
        {
            char c = stones.charAt(i);
            if(map.containsKey(c))
                count++;
        }
        return count;
    }
}