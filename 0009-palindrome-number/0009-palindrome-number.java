class Solution {
    public boolean isPalindrome(int x) {
        int mod, res = 0, num = x; 
        
        while(num > 0)
        {
            mod = num % 10;
            res = res * 10 + mod;
            num /= 10;
        }
        if(res == x)
        {
            return true;
        }
        return false;
    }
}