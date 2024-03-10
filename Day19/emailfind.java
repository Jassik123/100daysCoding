package etePdf;
import java.util.*;
public class emailfind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String[][] arr=new String[t][3];
        for(int i=0;i<t;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.next();
            }
        }
        String str=sc.next();
        boolean flag=false;

        for(int i=0;i<t;i++){
            if(arr[i][0].equals(str)) {
                for (int j = 0; j< 3;j++){
                    System.out.println(arr[i][j]);
                }
                flag= true;
                break;

            }
        }
        if(!flag){
            System.out.println("-1");
        }
    }
}
