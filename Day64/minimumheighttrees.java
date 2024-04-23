class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> list=new ArrayList<>();
        if(n<=0) return list;
        if(n==1){
            list.add(0);
            return list;
        }
        int[] ans=new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] a:edges){
            ans[a[0]]++;
            ans[a[1]]++;
            adj.get(a[0]).add(a[1]);
             adj.get(a[1]).add(a[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ans[i]==1){
                q.add(i);
            }}
            while(n>2){
                int size=q.size();
                n-=size;
                while(size-->0){
                    int v=q.poll();
                    for(int i:adj.get(v)){
                        ans[i]--;
                        if(ans[i]==1){
                            q.offer(i);
                        }
                    }
                }
            }
            list.addAll(q);
            return list;
        

    }
}