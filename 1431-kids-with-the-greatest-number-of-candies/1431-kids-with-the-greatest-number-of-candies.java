class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
//         List<Boolean> list = new ArrayList<>();
//         int max = 0;
//         for(int i: candies)
//         {
//             if(max < i)
//                 max = i;
//         }
        
//         for(int i: candies)
//         {
//             if((i + extraCandies) >= max)
//                 list.add(true);
//             else
//                 list.add(false);
//         }
//         return list;
        
        List<Boolean> list = new ArrayList<>();
        Integer[] arr = new Integer[candies.length];
        int count = 0;
        
        for(int i: candies)
            arr[count++] = i;
        
        int max = Collections.max(Arrays.asList(arr));
        
        for(int i: arr)
        {
            if((i+extraCandies) >= max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}