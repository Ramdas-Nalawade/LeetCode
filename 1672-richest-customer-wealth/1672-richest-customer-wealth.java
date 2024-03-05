class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int res = 0;
        
        for(int i = 0; i < accounts.length; i++)
        {
            int maxi = 0;
             for(int j = 0; j < accounts[i].length; j++)
             {
                 maxi += accounts[i][j];
             }
            res = Math.max(maxi, res);
        }
        return res;
    }
}