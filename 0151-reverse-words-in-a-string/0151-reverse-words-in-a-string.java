class Solution {
    public String reverseWords(String s) 
    {
//         String str = s.trim();
        
//         String[] arr = str.split(" ");
//         String arr2 = new String();
        
//         for(int i = arr.length - 1; i >= 0; i--)
//         {
//             arr2 += arr[i] + " ";
//         }
//         String val = arr2.trim();
//         for(int i = 0; i < val.length(); i++)
//         {
//             val = val.replace("  ", " ");
//         }
//         return val;
        
        String[] arr = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(arr));
        return String.join(" ", arr);
    }
}