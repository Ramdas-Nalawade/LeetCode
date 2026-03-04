class Solution {
    public boolean isPalindrome(String s) 
    {
        String updatedS = s.replaceAll("[^A-Za-z0-9]", "")
                            .toLowerCase();
        StringBuilder sb = new StringBuilder(updatedS);

        return updatedS.equals(sb.reverse().toString());
    }
}