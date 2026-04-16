class Solution {
    public int closestTarget(String[] words, String target, int startIndex) 
    {
        int minDistance = Integer.MAX_VALUE;
        int n = words.length;

        for(int i = 0; i < n; i++)
        {
            if(words[i].equals(target))
            {
                int diff = Math.abs(i-startIndex);
                int circularDistance = Math.min(diff, n-diff);
                minDistance = Math.min(minDistance, circularDistance);
            }
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}