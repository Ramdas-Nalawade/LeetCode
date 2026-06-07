class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < numbers.length; i++)
        // {
        //     int complement = target - numbers[i];

        //     if(map.containsKey(complement))
        //     {
        //         return new int[] {map.get(complement)+1, i+1};
        //     }
        //     map.put(numbers[i], i);
        // }
        // return new int[] {};

        int left = 0, n = numbers.length, right = n - 1;

            while(left < right)
        {
            int sum = numbers[left]+numbers[right];

            if(sum == target)
                return new int[] {left+1, right+1};
            else if(sum > target)
                right--;
            else
                left++;
        }
        return new int[] {};
    }
}