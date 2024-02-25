class Solution {
    
         public int[] merge(int[] arr1, int[] arr2)
        {
            int[] combined = new int[arr1.length + arr2.length];
            int index = 0;
            int i = 0;
            int j = 0;
            
            while(i < arr1.length && j < arr2.length)
            {
                if(arr1[i] < arr2[j])
                {
                    combined[index] = arr1[i];
                    index++;
                    i++;
                }
                else
                {
                    combined[index] = arr2[j];
                    index++;
                    j++;
                }
            }
            while(i < arr1.length)
            {
                combined[index] = arr1[i];
                    index++;
                    i++;
            }
            while(j < arr2.length)
            {
                combined[index] = arr2[j];
                    index++;
                    j++;
            }
            return combined;
        }
         public int[] sortArray(int[] nums)
        {
            int midIndex = nums.length/2;
            
            if(nums.length == 1)
                return nums;
            
            int[] left = sortArray(Arrays.copyOfRange(nums, 0, midIndex));
            int[] right = sortArray(Arrays.copyOfRange(nums, midIndex, nums.length));
            
            return merge(right, left);
        }
    
}