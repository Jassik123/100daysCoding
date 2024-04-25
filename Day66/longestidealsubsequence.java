class Solution {
    public int longestIdealString(String s, int k) {
        int res =0;
        int n=s.length();
        int[] dp=new int[150];
        for(int i=0;i<n;i++){
            int a=s.charAt(i);
            for(int j=a-k;j<=a+k;++j)
                dp[a]=Math.max(dp[a],dp[j]);
                res=Math.max(res,++dp[a]);

            
        }
            return res;
        
    }
}