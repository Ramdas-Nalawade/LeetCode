class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        if(s.length() != t.length())
            return false;
        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
       boolean result = Arrays.equals(arr, arr2);
        
        if(result)
            return true;
        return false;
    }
}