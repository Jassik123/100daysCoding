class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] arr=new boolean[n][m];
        boolean result=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    result=solve(board,word,arr,i,j,0);
                    if(result) return true;
                }
            }
        }
        return false;
    }
    private boolean solve(char[][] board,String word,boolean[][] arr,int i,int j,int index){
        if(index==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || arr[i][j] || board[i][j]!=word.charAt(index)){
            return false;
        }
        arr[i][j]=true;

        if(solve(board,word,arr,i+1,j,index+1)||
       solve(board,word,arr,i-1,j,index+1)||
       solve(board,word,arr,i,j+1,index+1)||
       solve(board,word,arr,i,j-1,index+1) ){
       return true;
       }
       arr[i][j]=false;
       return false;
    }
}