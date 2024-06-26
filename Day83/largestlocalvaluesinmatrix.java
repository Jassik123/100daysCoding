class Solution {
    public static int maxofgrid(int[][] grid,int row,int col){
        int max=0;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int[][] ans=new int[grid.length-2][grid.length-2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j]=maxofgrid(grid,i,j);
            }
        }
        return ans;
    }
}