class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
}

//Using Map
/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!counter.containsKey(ch) || counter.get(ch) == 0) {
                return false;
            }
            counter.put(ch, counter.get(ch) - 1);
        }

        return true;        
    }
}
*/

/* Using Stream API
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Integer, Long> sMap = s.chars()
                .boxed()
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        Map<Integer, Long> tMap = t.chars()
                .boxed()
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        return sMap.equals(tMap);
    }
}
 */