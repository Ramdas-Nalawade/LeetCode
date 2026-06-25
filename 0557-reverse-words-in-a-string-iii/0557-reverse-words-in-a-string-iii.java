class Solution {
    public String reverseWords(String s) 
    {
        String[] ans = s.split(" ");
        String result = "";

        for(int i = 0; i < ans.length; i++)
        {
            char[] curr = ans[i].toCharArray();
            int left = 0, right = curr.length - 1;
            
            while(left < right)
            {
                char temp = curr[left];
                curr[left] = curr[right];
                curr[right] = temp;

                left++;
                right--;
            }
            result += new String(curr) + " ";
        }
        return result.trim();
    }
}