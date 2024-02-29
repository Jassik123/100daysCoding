package start;
import java.util.*;
public class maxknightsinboard {
    static int maxknights=-1;
    static int number =5;
    public static boolean issafe(char[][] board,int row,int col){
        int n=board.length;

        int i,j;
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && board[i][j]=='K') return false;

        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;

        i=row+2;
        j=col+1;
        if(i<n && j<n && board[i][j]=='K') return false;


        i=row+2;
        j=col-1;
        if(i<n && j>=0 && board[i][j]=='K') return false;



        i=row-1;
        j=col+2;
        if(i>=0 && j<n && board[i][j]=='K') return false;


        i=row+1;
        j=col+2;
        if(i<n && j<n && board[i][j]=='K') return false;

        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;

        i=row+1;
        j=col-2;
        if(i<n && j>=0 && board[i][j]=='K') return false;

        return true;





    }
    public static void helper(char[][] board,int row,int col,int num){
        int n=board.length;
        if(row==n){
//            if(row==number) {
//                for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        System.out.print(board[i][j]);
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
            maxknights=Math.max(maxknights,num);
            return;

        }
        else if(issafe(board,row,col)){
            board[row][col]='K';
            if(col!=n-1) helper(board,row,col+1,num+1);
            else helper(board,row+1,col,num+1);
            board[row][col]='X';


        }
        if(col!=n-1) helper(board,row,col+1,num);
        else helper(board,row+1,col,num);


    }
    public static void main(String[] args) {
        int n=3;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
helper(board,0,0,0);
        System.out.println(maxknights);

    }
}
