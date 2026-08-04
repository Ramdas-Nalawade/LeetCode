class Solution {
    public boolean isPalindrome(String s) 
    {
        String uS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        int left = 0, right = uS.length() - 1;

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