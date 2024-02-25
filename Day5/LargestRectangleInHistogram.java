class Solution {
    public int largestRectangleArea(int[] heights) {
        int pre[]=prev(heights);
        int nex[]=next(heights);
        int area=0;
        for(int i=0;i<heights.length;i++){
            area=Math.max(area,heights[i]*(nex[i]-pre[i]-1));
        }
        return area;
        
    }
    public static int []prev(int []heights){
            int n=heights.length;
            int []res=new int[n];
            Stack<Integer>st=new Stack<>();
            res[0]=-1;
            st.push(0);
            for(int i=1;i<n;i++){
                while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                      res[i]=-1;
                   }
                   else{
                       res[i]=st.peek();
                   }
                   st.push(i);
            }
            return res;
    }
    public static int []next(int []heights){
            int n=heights.length;
            int []res=new int[n];
            Stack<Integer>st=new Stack<>();
            // res[n-1]=n;
            st.push(n-1);
            res[n-1]=n;
            for(int i=n-2;i>=0;i--){
                while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                      res[i]=n;
                   }
                   else{
                       res[i]=st.peek();
                   }
                   st.push(i);
            }
            return res;

    }
}

