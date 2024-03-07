package dp;
import java.util.*;
public class kthlargest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> arrlist=new ArrayList<>();
        for(int i=0;i<n;i++){
            arrlist.add(sc.nextInt());
        }

        int k=sc.nextInt();
        int result=find(arrlist,k);
        System.out.println(result);
    }

    private static int find(List<Integer> arrlist,int k){
        Collections.sort(arrlist,Collections.reverseOrder());
        return arrlist.get(k-1);
    }
}
