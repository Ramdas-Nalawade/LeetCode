class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x == 0)
            return true;

        String xU = String.valueOf(x);
        StringBuilder reverse = new StringBuilder();

        while(x > 0)
        {
            String temp = String.valueOf(x % 10);
            reverse.append(temp);
            x /= 10;
        }       
        return (reverse.toString()).equals(xU); 
    }
}