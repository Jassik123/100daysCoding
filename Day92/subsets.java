class Solution {
public static void solve(int index,int[] nums,List<Integer> list,List<List<Integer>> ans){
    int n=nums.length;
    if(index>=n){
        // List<Integer> temp=new ArrayList<>(list);
        ans.add(new ArrayList<>(list));
        return;
    }
    solve(index+1,nums,list,ans);//i+1
    list.add(nums[index]);
    solve(index+1,nums,list,ans);//i+1
    list.remove(list.size()-1);

}
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,nums,list,ans);
        return ans;
    }
}