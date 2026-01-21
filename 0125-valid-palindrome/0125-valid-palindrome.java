class Solution {
    public boolean isPalindrome(String s) 
    {
        String updatedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder sb = new StringBuilder(updatedString);
        sb.reverse();

        return sb.toString().equals(updatedString);
    }
}