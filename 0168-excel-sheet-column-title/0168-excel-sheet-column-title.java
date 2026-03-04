class Solution {
    public String convertToTitle(int columnNumber) 
    {
        String sb = "";

        while(columnNumber > 0)
        {
            columnNumber--;
            int rem = columnNumber % 26;
            sb += (char) ('A'+rem);
            columnNumber /= 26;
        }    

        StringBuilder s = new StringBuilder(sb);
        return s.reverse().toString();
    }
}