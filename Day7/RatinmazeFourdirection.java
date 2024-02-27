package start;
import java.util.*;
public class ratinmazefourdirection {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        boolean[][] isvisted=new boolean[rows][cols];
        print(0,0,rows-1,cols-1," ", isvisted);
    }
    private static void print(int sr,int sc,int er,int ec,String s,boolean[][] isvisted ){
        if(sr<0 || sc<0) return;
        if(sr>er|| sc>ec) return ;
        if(isvisted[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;

        }
        isvisted[sr][sc]=true;

        print(sr+1,sc,er,ec,s+"D",isvisted);
        //got down

        print(sr,sc+1,er,ec,s+"R",isvisted);
        //go right

        print(sr-1,sc,er,ec,s+"U",isvisted);

        //go up

        print(sr,sc-1,er,ec,s+"L",isvisted);

        isvisted[sr][sc]=false;
    }
}
