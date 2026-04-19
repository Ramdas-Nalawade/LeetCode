class Solution {
    public int mirrorDistance(int n) 
    {
        int reverse = reverse(n);
        return Math.abs(n - reverse);        
    }
    public int reverse(int n)
    {
        StringBuilder ans = new StringBuilder(Integer.toString(n));
        ans.reverse();
        int num = Integer.parseInt(ans.toString());
        return num;
    }
}