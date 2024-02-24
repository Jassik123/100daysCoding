package start;

public class DistributeChocolates {

    public static boolean DivisionsAllowed(int[] a,int m,int mxchocolateAllowed){
        int NoOfStudents=1;
        int choc=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>mxchocolateAllowed) return false;
            if(choc+a[i]<=mxchocolateAllowed){
                choc+=a[i];
            }else {
                NoOfStudents++;
                choc = a[i];
            }
        }
        if(NoOfStudents>m) return false;
        return true;
    }
    public static int distributeChocolates(int[] a,int m){
        if(a.length<m) return -1;
        int ans=0;
        int start=1;
        int end=(int)1e9;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(DivisionsAllowed(a,m,mid)){
                ans=mid;
                end=mid-1;

            }else{
                start=mid+1;
            }
        }
          return ans;
    }
    public static void main(String[] args) {
        int[] a={5,3,1,4,2};
        int m=3;
        System.out.println(distributeChocolates(a,m));
    }
}
