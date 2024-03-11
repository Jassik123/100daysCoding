package etePdf;
import java.util.*;
public class Funnydigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            char[] ch=String.valueOf(n).toCharArray();
            boolean flag =true;
            for(int i=1;i<ch.length;i++){
                if(i==ch.length-1 && ch[i]>ch[i-1]){
                    flag= false;
                }

                if(ch[i-1]>ch[i]){
                    n--;
                    break;
                }
            }
            System.out.println(n);

        }

    }
}
