class Solution 
{
    private int getSum(int num)
    {
        int sum = 0;

        while(num > 0)
        {
            int current = num % 10;
            sum += current * current;
            num /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) 
    {
        int slow = n, fast = n;

        do
        {
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }while(slow != fast);

        return slow == 1;
    }
}