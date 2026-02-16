class Solution {
    public String reverseWords(String s) 
    {
        String[] arr = s.split(" ");
        String result = "";

        for(int i = 0; i < arr.length; i++)
        {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            result += sb + " ";
        }        
        return result.trim();
    }
}