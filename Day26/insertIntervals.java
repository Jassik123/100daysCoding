class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        int start=newInterval[0], end=newInterval[1];
        boolean insert=false;

        for(int[] a:intervals){
            int cstart= a[0],cend=a[1];

            if(cend<start || insert){
                ans.add(new int[] {cstart,cend});
                continue;
            }
            start=Math.min(start,cstart);
            if(end<cstart){
                ans.add(new int[] {start,end});
                ans.add(new int[] {cstart,cend});
                insert =true;
                continue;
            }
             if (end <= cend) {
                ans.add(new int[]{start, cend});
                insert = true;
            }
        }

     if (!insert) {
            ans.add(new int[]{start, end});
        }
        
        return ans.toArray(new int[ans.size()][]);

    }
}