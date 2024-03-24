package amcat;
import java.util.*;
public class distinctelements {
    private static void alldistinctvalues(int[] arr1,int[] arr2){
        Set<Integer> distinctelement=new HashSet<>();
        for(int element: arr1){
            distinctelement.add(element);
        }

        for(int element:arr2){
            distinctelement.add(element);
        }

        System.out.println("Distinct elements:");
        for(int element:distinctelement){
            System.out.print(element + " ");
        }
        System.out.println();
        int total=0;
        for(int element:distinctelement){
            total+=element;


        }
        System.out.println("total distinct elements:" + total);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        int m=sc.nextInt();

        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]= sc.nextInt();
        }
        alldistinctvalues(arr1,arr2);
    }
}
