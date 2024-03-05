class Solution {
    public static int ncr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int) res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();

        for(int row=1;row<=numRows;row++){
            List<Integer> templst=new ArrayList<>();

            for(int col=1;col<=row;col++){
                templst.add(ncr(row-1,col-1));
            }
            ans.add(templst);
          

        }
          return ans;
        
        
    }
}