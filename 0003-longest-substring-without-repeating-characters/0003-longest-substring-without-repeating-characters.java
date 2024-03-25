class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int l = 0, r = 0, maxLength = 0;
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        if(arr.length < 0)
            return arr.length;

        while(r < arr.length)
        {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while(map.size() != r - l + 1)
            {
                map.put(arr[l], map.get(arr[l])-1);
                if(map.get(arr[l]) == 0)
                    map.remove(arr[l]);
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }
}