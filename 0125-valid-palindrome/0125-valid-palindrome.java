class Solution {
    public boolean isPalindrome(String s) 
    {
        String sReverse = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // String reverseS = "";

        // for(int i = sReverse.length() - 1; i >= 0; i--)
        // {
        //     reverseS += sReverse.charAt(i);
        // }

        // return sReverse.equals(reverseS); 
        StringBuilder sb = new StringBuilder(sReverse);
        sb.reverse();

        return sReverse.equals(sb.toString());   
    }
}