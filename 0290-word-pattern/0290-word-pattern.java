class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        for(int i = 0; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            String temp = (arr[i]);
            
            if(map.containsValue(temp) && !map.containsKey(ch))
                return false;
            else if(map.containsKey(ch) && !map.get(ch).equals(temp))
                return false;
            else
                map.put(ch, temp);
        }
        return true;
    }
}