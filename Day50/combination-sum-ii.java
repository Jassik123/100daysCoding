class Solution {
    private static void backtrack(List<List<Integer>> list,List<Integer> temp,int[] ans,int remain,int start){
        if(remain<0){
            return;
        }else if(remain==0) list.add(new ArrayList<>(temp));
        else{
            for(int i=start;i<ans.length;i++){
                if(i > start && ans[i] == ans[i-1]) continue;
                temp.add(ans[i]);
                backtrack(list,temp,ans,remain-ans[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list,new ArrayList<Integer>(),candidates,target,0);
        return list;
    }

}