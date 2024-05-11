class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=quality.length;
        int[][] workers=new int[n][2];
        for(int i=0;i<n;i++){
            workers[i]=new int[] {quality[i],wage[i]};
        }
        Arrays.sort(workers,(a,b)-> {
            return Double.compare((double)a[1]/a[0],(double)b[1]/b[0]);
        });
        double ans=Double.MAX_VALUE;
        int total=0;
        for(int[] worker:workers){
            total+=worker[0];
            pq.offer(worker[0]);
            if(pq.size()>k){
                total-=pq.poll();
            }
            if(pq.size()==k){
                ans=Math.min(ans,total*(double)worker[1]/worker[0]);
            }
        }
        return ans;
    }
}