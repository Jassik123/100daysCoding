package amcat;
import java.util.*;
public class possibletriplets {
    private static int counttriplets(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=i+2;
            while(right<n){
                if(arr[i]+arr[left]>arr[right]){
                    count+=right-left;
                    right++;
                }
                else{
                    left++;
                    if(right==left){
                        right++;
                    }
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("no of triplets:"+ counttriplets(arr));
    }
}
