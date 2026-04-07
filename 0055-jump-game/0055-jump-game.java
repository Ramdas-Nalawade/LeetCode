class Solution {
    public boolean canJump(int[] nums) 
    {
        int goal = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(i > goal)
                return false;

            goal = Math.max(goal ,i+nums[i]);
        }
        return true;
    }
}

// class Solution {
//     public boolean canJump(int[] nums) 
//     {
//         int goal = nums.length - 1;

//         for(int i = nums.length - 2; i >= 0; i--)
//         {
//             if((i+nums[i]) >= goal)
//                 goal = i;
//         }
//         return goal == 0;
//     }
// }