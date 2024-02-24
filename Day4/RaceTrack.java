package start;

public class RcaeTrack {

    public static boolean ispossible(int[] a,int k,int dist){
        int kidPlaced=1;
        int lastkid=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]-lastkid>=dist){
                kidPlaced++;
                lastkid=a[i];
            }
        }
        return kidPlaced>=k;
    }
    public static int optimalRaceTrack(int[] a,int k){
        if(k>a.length) return -1;
        int start=0;
        int end=(int)1e9;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ispossible(a,k,mid)){
                ans=mid;
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,8,9};
        int k=3;
        System.out.println(optimalRaceTrack(a,k));
    }
}
