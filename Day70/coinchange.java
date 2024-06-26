class Solution {
    
    public static int solve(int i,int[][] dp,int[] coins,int amount){
        if(amount==0)
            return 1;
        if(i<coins.length){
        if(dp[i][amount]==-1){
        if(coins[i]>amount)
            return 0;
        return dp[i][amount]=solve(i,dp,coins,amount-coins[i])+solve(i+1,dp,coins,amount);
        }
        return dp[i][amount];
        }
        return 0;

    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
            Arrays.sort(coins);
         
        }
           return solve(0,dp,coins,amount);
    }
    
}