class Solution {
    HashMap<Character, Set<Integer>> mp;
    int[][] dp;
    
    public int solve(String ring, int x, String key, int y) {
        if (y == key.length()) return 0;
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        int min = Integer.MAX_VALUE;
        for (int next : mp.get(key.charAt(y))) {
            int oneway = Math.abs(next - x);
            int anotherway = ring.length() - oneway;
            int steps = Math.min(oneway, anotherway);
            min = Math.min(min, steps + solve(ring, next, key, y + 1));
        }
        dp[x][y] = min;
        return min;
    }

    public int findRotateSteps(String ring, String key) {
        int n = ring.length();
        int m = key.length();
        dp = new int[n][m];
        mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = ring.charAt(i);
            if (!mp.containsKey(c)) {
                mp.put(c, new HashSet<Integer>());
            }
            mp.get(c).add(i);
        }
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return solve(ring, 0, key, 0) + m;
    }
}