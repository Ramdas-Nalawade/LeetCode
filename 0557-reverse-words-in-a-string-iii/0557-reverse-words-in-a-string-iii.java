class Solution {
    public String reverseWords(String s) 
    {
        String result = "";
        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++)
        {
            StringBuilder sb = new StringBuilder(arr[i]);
            result += sb.reverse().toString()+" ";
        }     
        return result.trim();
    }
}