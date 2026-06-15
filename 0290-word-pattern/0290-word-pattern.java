class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        if(pattern.length() != arr.length)
            return false;

        for(int i = 0; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            StringBuilder temp = new StringBuilder(arr[i]);
            
            if(map.containsValue(temp) && !map.containsKey(ch))
                return false;
            else if(map.containsKey(ch) && !map.get(ch).equals(temp.toString()))
                return false;
            else
                map.put(ch, temp.toString());
        }
        return true;
    }
}