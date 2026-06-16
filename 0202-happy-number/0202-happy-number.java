class Solution 
{
    private int getSum(int num)
    {
        int val = 0;

        while(num > 0)
        {
            int current = num % 10;
            int currSqu = current * current;
            val += currSqu;
            num /= 10;
        }
        return val;
    }
    public boolean isHappy(int n) 
    {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n))
        {
            set.add(n);
            n = getSum(n);
        }
        return n == 1;
    }
}