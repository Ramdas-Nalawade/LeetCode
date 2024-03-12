class Solution {
    public String reformatDate(String date) 
    {
        int i = date.lastIndexOf(" ");
        int b = date.indexOf(" ");
        int min = b+1;
        int max = min+3;
        String year = "";
        String dt = "";
        String month = "";
        String mon = "";

        for(; i < date.length(); i++)
        {
            year += date.charAt(i);
        }

        for(; min < max; min++)
        {
            month += date.charAt(min);
        }

        if(month.equals("Jan"))
            mon +="01";
        else if(month.equals("Feb"))
            mon = "02";
        else if(month.equals("Mar"))
            mon = "03";
        else if(month.equals("Apr"))
            mon = "04";
            else if(month.equals("May"))
            mon = "05";
        else if(month.equals("Jun"))
            mon = "06";
        else if(month.equals("Jul"))
            mon = "07";
        else if(month.equals("Aug"))
            mon = "08";
        else if(month.equals("Sep"))
            mon = "09";
        else if(month.equals("Oct"))
            mon = "10";
            else if(month.equals("Nov"))
            mon = "11";
        else if(month.equals("Dec"))
            mon = "12";

        for(int j = 0; j < date.length(); j++)
        {
            for(int a = 0; a <= 9; a++)
            {
                if(date.charAt(j) == a)
                {
                    dt += j;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
                
        for(int d = 0; d < 2; d++)
        {
            if(Character.isDigit(date.charAt(d)))
                sb.append(date.charAt(d));
        }
        String myDate = "0";

        if(sb.length() == 1)
            myDate += sb.toString();

        if(sb.length() == 1)
            return year.trim()+"-"+mon+"-"+myDate;
        return year.trim()+"-"+mon+"-"+sb.toString();
    }
}