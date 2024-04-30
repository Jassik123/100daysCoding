class Solution {
    
    public int solve(int[] arr, int start, int end, int[][] dp) {
        if (start > end) return 0;
        if (dp[start][end] != 0) return dp[start][end];
        
        
        for (int i = start; i <= end; i++) {
            int curr=arr[i];
            if(start-1>=0) curr*=arr[start-1];
            if(end+1<arr.length) curr*=arr[end+1];
            curr += solve(arr, start, i - 1, dp) + solve(arr, i + 1, end, dp);
            
        
        dp[start][end]=Math.max(curr,dp[start][end]);
        }
        return dp[start][end];
    }
    
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        return solve(nums, 0, n - 1, dp);
    }
}
