class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
    PriorityQueue<int[]> q=new PriorityQueue<>(Comparator.comparingDouble(a->(double)a[0]/a[1]));
    int N=arr.length;
    for(int i=0;i<N;++i){
        for(int j=i+1;j<N;++j){
            q.offer(new int[] {arr[i],arr[j]});
        }
    }
    int[] result=null;
    for(int i=0;i<k;i++){
        result=q.poll();
    }
    return result;
    }
}