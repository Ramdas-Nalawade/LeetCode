class Solution {
    public int thirdMax(int[] nums) 
    {
        Set<Integer> set = new TreeSet<>();

        for(int i: nums)
            set.add(i);

        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        return arr.length < 3 ? arr[arr.length - 1] : arr[arr.length - 3];
    }
}