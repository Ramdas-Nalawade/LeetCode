class Solution {
    public int thirdMax(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();

        for(int i: nums)
            set.add(i);

        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        return arr.length < 3 ? arr[arr.length - 1] : arr[arr.length - 3];
    }
}