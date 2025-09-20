class Solution {
    public boolean isPalindrome(String s) 
    {
        String ans = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(ans);
        String compare = sb.reverse().toString();

        for(int i = 0; i < ans.length(); i++)
        {
            if(ans.charAt(i) != compare.charAt(i))
                return false;
        }
        return true;
    }
}