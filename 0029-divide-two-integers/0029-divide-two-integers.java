class Solution {
    public int divide(int dividend, int divisor) 
    {
        int quo = (int) Math.floor(dividend/divisor);

        if(quo == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if(quo > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(quo < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return quo;        
    }
}