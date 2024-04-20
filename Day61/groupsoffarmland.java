class Solution {
    public int[][] findFarmland(int[][] land) {
        int n=land.length;
        int m=land[0].length;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(land[i][j]==0) continue;

                int c1=j;
                while(c1<m && land[i][c1]==1){
                    c1++;
                }
                int r1=i;
                while(r1<n && land[r1][j]==1){
                    r1++;
                }
                c1=c1==0?c1:c1-1;
                r1=r1==0?r1:r1-1;
               List<Integer> list=new ArrayList<>();
               list.add(i);
               list.add(j);
               list.add(r1);
               list.add(c1);
               result.add(list);

                for(int k=i;k<=r1;k++){
                    for(int l=j;l<=c1;l++){
                        land[k][l]=0;
                    }
                }
            }
        }
        int[][] output=new int[result.size()][4];
        for(int i=0;i<result.size();i++){
            List<Integer> list=result.get(i);
            output[i][0]=list.get(0);
            output[i][1]=list.get(1);
            output[i][2]=list.get(2); 
            output[i][3]=list.get(3);
        }
        return output;
    }
}