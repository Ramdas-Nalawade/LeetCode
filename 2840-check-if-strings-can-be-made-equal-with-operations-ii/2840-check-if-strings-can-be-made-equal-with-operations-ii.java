class Solution {
    public boolean checkStrings(String s1, String s2) 
    {
        List<Character> list1Even = new ArrayList<>();
        List<Character> list2Even = new ArrayList<>();
        List<Character> list1Odd = new ArrayList<>();
        List<Character> list2Odd = new ArrayList<>();

        for(int i = 0; i < s1.length(); i++)
        {
            if(i % 2 == 0)
            {
                list1Even.add(s1.charAt(i));
                list2Even.add(s2.charAt(i));
            }
            else
            {
                list1Odd.add(s1.charAt(i));
                list2Odd.add(s2.charAt(i));
            }
        }

        Collections.sort(list1Even);
        Collections.sort(list2Even);
        Collections.sort(list1Odd);
        Collections.sort(list2Odd);

        return list1Even.equals(list2Even) && list1Odd.equals(list2Odd);
    }
}