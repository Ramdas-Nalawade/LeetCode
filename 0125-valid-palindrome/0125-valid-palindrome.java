class Solution {
    public boolean isPalindrome(String s) 
    {
        String arr = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(arr);
        
        return sb.reverse().toString().equals(arr);
    }
}