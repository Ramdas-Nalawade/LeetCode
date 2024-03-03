class Solution {
    public int countSegments(String s) 
    {
        return (int) Arrays.stream(s.trim().split(" ")).filter(l -> l.length() > 0).count();        
    }
}