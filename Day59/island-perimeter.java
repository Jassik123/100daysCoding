class Solution {
    public int islandPerimeter(int[][] grid) {
        int output=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    output+=dfs(grid,i+1,j);
                    output+=dfs(grid,i,j+1);
                    output+=dfs(grid,i-1,j);
                    output+=dfs(grid,i,j-1);
                }
            }
        }
        return output;
    }
    private int dfs(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length|| grid[i][j]==0){
            return 1;
        }
        return 0;
    }
}