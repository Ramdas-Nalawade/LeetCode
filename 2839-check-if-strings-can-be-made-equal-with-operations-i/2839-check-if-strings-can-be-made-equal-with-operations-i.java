class Solution {
    public boolean canBeEqual(String s1, String s2) 
    {
        char[] s1_g1 = {s1.charAt(0), s1.charAt(2)};
        char[] s1_g2 = {s2.charAt(0), s2.charAt(2)};

        char[] s2_g1 = {s1.charAt(1), s1.charAt(3)};
        char[] s2_g2 = {s2.charAt(1), s2.charAt(3)};

        Arrays.sort(s1_g1);
        Arrays.sort(s1_g2);
        Arrays.sort(s2_g1);
        Arrays.sort(s2_g2);

        return Arrays.equals(s1_g2, s1_g1) && Arrays.equals(s2_g1,s2_g2);
    }
}