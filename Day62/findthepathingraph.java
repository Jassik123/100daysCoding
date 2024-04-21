class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int[] edge:edges){
            int u=edge[0],
                v=edge[1];

            map.computeIfAbsent(u,x->new ArrayList()).add(v);
            map.computeIfAbsent(v,x->new ArrayList()).add(u);

        }
        Set<Integer> set=new HashSet<>();
        set.add(source);
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(source);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-- >0){
                int curr=queue.poll();
                if(curr==destination){
                    return true;
                }
                set.add(curr);
                for(int adj:map.get(curr)){
                    if(!set.contains(adj)){
                        queue.offer(adj);
                        set.add(adj);
                    }
                }
            }
        }
        return false;
    }
}