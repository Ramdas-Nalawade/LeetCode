class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs)
        {
            char[] current = s.toCharArray();
            Arrays.sort(current);

            String key = new String(current);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}