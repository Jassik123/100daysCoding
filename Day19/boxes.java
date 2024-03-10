package etePdf;
import java.util.*;
public class boxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
;
        }
        int pairs=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>0 && a[j]>0 ){
                    int niPairs=Math.min(a[i],a[j]);
                    pairs+=niPairs;
                    a[j]-=niPairs;
                    a[i]-=niPairs;

                }
            }
        }
        System.out.println(pairs);
    }
}
