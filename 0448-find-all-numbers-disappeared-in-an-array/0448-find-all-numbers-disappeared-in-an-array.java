class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i = 1; i <= nums.length; i++)
        {
            if(!map.containsKey(i))
                list.add(i);
        }
        return list;
    }
}