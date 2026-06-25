class Solution {
    public boolean isPalindrome(String s) 
    {
        
        String uS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = uS.length()-1;

        while(left < right)
        {
            if(uS.charAt(left) != uS.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}