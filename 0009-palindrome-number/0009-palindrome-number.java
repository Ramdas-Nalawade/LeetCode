class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x == 0)
            return true;

        String xU = String.valueOf(x);
        String reverse ="";

        while(x > 0)
        {
            String temp = String.valueOf(x % 10);
            reverse += temp;
            x /= 10;
        }       
        return reverse.equals(xU); 
    }
}