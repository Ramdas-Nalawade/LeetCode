class Solution {
    public String reverseWords(String s) 
    {
        String[] arr = s.split(" ");
        String str = "";

        for(int i = 0; i < arr.length; i++)
        {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            str += sb + " ";
        }
        return str.trim();
    }
}