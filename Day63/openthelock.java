class Solution {
    private void fill(Queue<String> q,String curr,HashSet<String> set,HashSet<String> visited){
         char[] chars = curr.toCharArray();
        for(int i=0;i<4;i++){
            char ch=chars[i];
          

            chars[i] = ch == '9' ? '0' : (char) (ch + 1);
            String inc = new String(chars);
            if (!set.contains(inc) && visited.add(inc)) {
                q.offer(inc);
            }
            
            
            chars[i] =ch == '0' ? '9' : (char) (ch - 1);
            String dec = new String(chars);
            if (!set.contains(dec) && visited.add(dec)) {
                q.offer(dec);
            }
           
            chars[i]=ch;

        }

    }
    public int openLock(String[] deadends, String target) {
         HashSet<String> set=new HashSet<>();
       for(String ans:deadends){
            set.add(ans);
         }
        String start="0000";
        if(set.contains(start)) return -1;

        Queue<String> q=new LinkedList<>();
          HashSet<String> visited=new HashSet<>();
        
        q.offer(start);
        visited.add(start);


        int level=0;
          while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                if (curr.equals(target)) {
                    return level;
                }
                 fill(q,curr,set,visited);
            }
            level++;
        }
        return -1;
    }
}