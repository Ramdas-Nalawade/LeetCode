class Solution {
    public String reverseWords(String s) 
    {
        String result = "";
        String[] arr = s.split(" ");

        for(String i: arr)
        {
            StringBuilder sb = new StringBuilder(i);
            result += sb.reverse()+" ";
        }
        return result.trim();
    }
}