class Solution {
    public boolean isPalindrome(String s) 
    {
        char[] uS = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        // if(uS.length <= 1)
        //     return true;
            
        int left = 0;
        int right = uS.length - 1;

        while(left < right)
        {
            if(uS[left] != uS[right])
                return false;
            else
            {
                left++;
                right--;
            }
        }
        return true;
    }
}