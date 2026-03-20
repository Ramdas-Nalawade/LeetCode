class Solution {
    public boolean isPalindrome(String s) 
    {
        String arr = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(arr);

        return arr.equals(sb.reverse().toString());
    }
}