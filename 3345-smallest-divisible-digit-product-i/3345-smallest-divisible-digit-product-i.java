class Solution {
    public int smallestNumber(int n, int t) 
    {
        for(int i = n; i <= 100; i++)
        {
            if(product(i) % t == 0)
                return i;
        } 
        return -1;
    }
    private int product(int num)
    {
        int ans = 1;

        while(num > 0)
        {
            int mod = num % 10;
            ans *= mod;
            num /= 10;
        }
        return ans;
    }
}