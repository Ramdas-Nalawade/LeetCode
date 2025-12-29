class Solution {
    public boolean isPalindrome(String s) 
    {
       String updatedS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
       StringBuilder sb = new StringBuilder(updatedS);
       sb.reverse();

       return sb.toString().equals(updatedS);
    }
}