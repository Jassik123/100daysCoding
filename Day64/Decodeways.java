class Solution {
    int[] dp;
    public int numDecodings(String s) {
        int n = s.length();
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return decode(s, 0);
    }
    
    private int decode(String str, int index) {
        if (index == str.length()) return 1;
        if (index > str.length()) return 0;
        if (dp[index] != -1) return dp[index];
        if(str.charAt(index)=='0') return 0;
        
        int res = decode(str, index + 1);
        
        if (index < str.length() - 1 && (str.charAt(index) == '1' || (str.charAt(index) == '2' && str.charAt(index + 1) <= '6' && str.charAt(index + 1) >= '0'))) {
            res += decode(str, index + 2);
        }
        
        dp[index] = res;
        return dp[index];
    }
}