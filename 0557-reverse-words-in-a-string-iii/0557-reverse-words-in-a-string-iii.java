class Solution {
    public String reverseWords(String s) 
    {
        String result = "";
        String[] temp = s.split(" ");

        for(int i = 0; i < temp.length; i++)
        {
            StringBuilder sb = new StringBuilder(temp[i]);
            result += sb.reverse()+" ";
        }
        return result.trim().toString();
    }
}