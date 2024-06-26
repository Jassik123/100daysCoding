class Solution {
    int paths;
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return dfs(obstacleGrid,0,0);
       
    }
    private int dfs(int[][] grid,int row,int col){
        if(row<0||col<0|| row==grid.length||col==grid[0].length|| grid[row][col]==1){
            return 0;
        }
        if(row==grid.length-1 && col==grid[0].length-1){
            paths++;
            return 1;
        }
        if(dp[row][col]>-1){
            return dp[row][col];
        }
        dp[row][col]=dfs(grid,row,col+1)+ dfs(grid,row+1,col);
       return dp[row][col];
           
    }
}