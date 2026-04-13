class Solution {
    public boolean isPalindrome(String s) 
    {
        String lowerS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(lowerS);

        return sb.reverse().toString().equals(lowerS);
    }
}