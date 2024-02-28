class Solution{ 
    public boolean issafe(char[][] board,int row,int col){
        int n=board.length;
        //for row
        for(int j=0;j<n;j++){
           if(board[row][j]=='Q') return false;
        }
        //for col
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        //north east

        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //south east
         i=row;
         j=col;
         while(i<n && j<n){
             if(board[i][j]=='Q') return false;
             i++;
             j++;
         }

         //southwest
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        //north west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }



return true;
    }
    
     private void nqueens(char[][] board,int row, List<List<String>> ans){
        int n=board.length;
        if(row==n){
            List<String> l= new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;

        }

        
        for(int j=0;j<n;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                nqueens(board,row+1,ans);
                board[row][j]='.';
            }
        }


    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
          List<List<String>> ans=new ArrayList<>();
          nqueens(board,0,ans);
          return ans;

       
    
    }
    }
