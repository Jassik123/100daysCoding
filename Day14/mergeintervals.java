class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
         int total=intervals.length;

         int start=intervals[0][0];
         int end =intervals[0][1];

         List<int[]> merge=new ArrayList<>();

         for(int i=1;i<total;i++){
             if(intervals[i][0]>end){
             merge.add(new int[] {start,end});


             start=intervals[i][0];
             end=intervals[i][1];
         }
         else{
             end=Math.max(end,intervals[i][1]);
         }
    }
    merge.add(new int[] {start,end});
    return merge.toArray(new int[merge.size()] []);
}
}