class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length == 0)
            return "";        
        
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i = 0; i < Math.min(first.length(), last.length()); i++)
        {
            if(first.charAt(i) != last.charAt(i))
                return sb.toString();
            sb.append(last.charAt(i));
        }
        return sb.toString();
    }
}