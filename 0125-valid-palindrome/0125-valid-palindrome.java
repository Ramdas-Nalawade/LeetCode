class Solution {
    public boolean isPalindrome(String s) 
    {
        String uS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(uS);
        return sb.reverse().toString().equals(uS);
    }
}