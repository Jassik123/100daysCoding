class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count+=1;
                    dfs(grid,i,j,n,m);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid,int i,int j,int row,int col){
        if(i<0||i>=row||j<0||j>=col||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j,row,col);
        dfs(grid,i-1,j,row,col);
        dfs(grid,i,j+1,row,col);
        dfs(grid,i,j-1,row,col);
    }
}