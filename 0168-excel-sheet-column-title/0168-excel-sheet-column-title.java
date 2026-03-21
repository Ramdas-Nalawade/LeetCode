class Solution {
    public String convertToTitle(int columnNumber) 
    {
        StringBuilder result = new StringBuilder();

        while(columnNumber > 0)
        {
            columnNumber--;
            int temp = columnNumber % 26;
            char ch = (char) ('A'+temp);
            result.append(ch);
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}