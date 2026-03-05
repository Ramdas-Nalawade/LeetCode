class Solution {
    public int thirdMax(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();

        for(int i: nums)
            set.add(i);

        Integer[] arr = set.toArray(new Integer[0]);
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr.length > 2 ? arr[arr.length - 3] : arr[arr.length - 1];
    }
}