class Solution {
    public String convertToTitle(int columnNumber) 
    {
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0)
        {
            columnNumber--;
            int mod = columnNumber % 26;
            char c = (char) (mod+'A');
            sb.append(c);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}