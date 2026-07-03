class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;

        for(int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        for(int i = 1; i <= n; i++)
            if(!set.contains(i))
                list.add(i);

        return list;
    }
}