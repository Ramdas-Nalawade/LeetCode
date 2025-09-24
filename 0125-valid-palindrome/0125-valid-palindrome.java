class Solution {
    public boolean isPalindrome(String s) 
    {
        String ans = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();

        for(int i = 0; i < ans.length(); i++)
        {
            if(sb.charAt(i) != ans.charAt(i))
                return false;
        }
        return true;
    }
}