class Solution {
    int findSum(int[] nums){
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        int sum = findSum(nums);
        int total= (sum+target)/2;
        
        if((sum+target)%2 != 0 || sum < Math.abs(target)) 
            return 0;
        
        int[][] dp = new int[nums.length + 1][total + 1];
        dp[0][0] = 1;
        
        for(int i = 1; i <= nums.length; i++) {
            for(int j = 0; j <= total; j++) {
                dp[i][j] = dp[i-1][j];
                if(nums[i-1] <= j) {
                    dp[i][j] += dp[i-1][j-nums[i-1]];
                }
            }
        }
        
        return dp[nums.length][total];
    }
}