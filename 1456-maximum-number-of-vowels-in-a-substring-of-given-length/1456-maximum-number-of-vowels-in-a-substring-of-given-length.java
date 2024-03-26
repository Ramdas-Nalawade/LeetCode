class Solution 
{
    public int maxVowels(String s, int k) 
    {
        int l = 0, r = 0, count = 0, n = 0, max = 0;
        char[] arr = s.toCharArray();

        while(r < arr.length)
        {
            if(arr[r] == 'a' || arr[r] == 'e' || 
            arr[r] == 'i' || arr[r] == 'o' || 
            arr[r] == 'u')
                count++;

            if(r - l == k)
            {
                if(arr[l] == 'a' || arr[l] == 'e' || 
            arr[l] == 'i' || arr[l] == 'o' || 
            arr[l] == 'u')
                count--;
                l++;
            }
            max = Math.max(count, max);
            
            r++;
        }
        return max;
    }
}

