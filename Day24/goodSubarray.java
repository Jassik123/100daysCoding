package etePdf;
import java.util.*;
public class goodSubarray {
    public static void solutions(int[] a,int i,int k,int[] ans,boolean[] hash){
        if(k==0){
            ans[0]++;
        }
        if(i==a.length){
            return;
        }
        if(hash[a[i]]){
            solutions(a,i+1,k,ans,hash);
        }
        else if(k>0){
            hash[a[i]]=true;
            solutions(a,i+1,k-1,ans,hash);
            hash[a[i]]=false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] ans=new int[1];
        boolean hash[]=new boolean[n+1];
        for(int i=0;i<n;i++){
            solutions(a,i,k,ans,hash);
        }
        System.out.println(ans[0]);

    }
}
