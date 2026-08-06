class Solution {
    public String reverseWords(String s) 
    {
        String result = "";
        String[] temp = s.split(" ");

        for(int i = 0; i < temp.length; i++)
        {
            // StringBuilder sb = new StringBuilder(temp[i]);
            // result += sb.reverse()+" ";

            char[] arr = temp[i].toCharArray();
            int left = 0, right = temp[i].length() - 1;

            while(left < right)
            {
                char c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;

                left++;
                right--;
            }
            result += new String(arr)+" ";
        }
        return result.trim();
    }
}