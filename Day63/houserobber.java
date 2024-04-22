class Solution {
     private int[] dp;

    private int robbing(int[] arr, int i) {
        if (i < 0) return 0;
        if (dp[i] != -1) return dp[i];

        dp[i] = Math.max(arr[i] + robbing(arr, i - 2), robbing(arr, i - 1));
        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        dp = new int[n];
        Arrays.fill(dp, -1);

        return robbing(nums, n - 1);
        
    }
}