class Solution {
    public boolean isPalindrome(String s) 
    {
        String us = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = us.length() - 1;

        while(left < right)
        {
            if(us.charAt(left) != us.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}