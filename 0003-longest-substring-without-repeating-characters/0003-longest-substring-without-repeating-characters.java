class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int left = 0, count = 0, right = 0;
        List<Character> list = new ArrayList<>();

        while(right < s.length())
        {
            if(!list.contains(s.charAt(right)))
            {
                list.add(s.charAt(right));
                right++;
                count = Math.max(count, list.size());
            }
            else
            {
                list.remove(Character.valueOf(s.charAt(left)));
                left++;
            }
        }
        return count;
    }
}