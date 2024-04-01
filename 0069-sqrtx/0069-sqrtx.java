class Solution {
    public int mySqrt(int x) 
    {
        // return (int) Math.sqrt(x);

        double d = x;

        while(d * d > x)
        {
            d = (d + x/d) / 2;
        }
        return (int) d;
    }
}