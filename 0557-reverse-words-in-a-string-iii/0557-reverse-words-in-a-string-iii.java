class Solution {
    public String reverseWords(String s) 
    {
        String result = "";
        String[] arr = s.split(" ");

        for(String i: arr)
        {
            char[] temp = i.toCharArray();
            int left = 0, right = i.length() - 1;

            while(left < right)
            {
                char c = temp[left];
                temp[left] = temp[right];
                temp[right] = c;

                left++;
                right--;
            }
            result += new String(temp)+" ";
        }
        return result.trim();
    }
}