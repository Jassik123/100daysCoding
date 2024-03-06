import java.util.ArrayList;

public class Solution {
    public static int merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        int count=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                count+=mid-left+1;
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);

        }
        return count;
    }
    public static int mergesort(int[] arr,int low,int high){
        int count=0;
        if(low>=high) return count;
        int mid=low+(high-low)/2;
        count+=mergesort(arr, low, mid);
        count+=mergesort(arr, mid+1, high);
        count+=merge(arr, low, mid, high);
        return count;
    }
    public static int numberOfInversions(int []arr, int n) {
        return mergesort(arr, 0, n-1);
        // Write your code here.
    }
}