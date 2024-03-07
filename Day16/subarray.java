package classwork;
import java.util.*;
public class subarrayques2 {
    public static int subarray(int n){

        int[] arr=new int[n];
        int id=1;
        int count=1;
        for(int i=1;i<=n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;

            }
            if(count<=2){
                arr[id++]=arr[i];

            }

        }
        return id;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans =subarray(n);


        System.out.println(ans);

    }
}
