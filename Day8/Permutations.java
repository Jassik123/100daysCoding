import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void helper(int[] nums, List<Integer> ds, boolean[] isvalid, List<List<Integer>> ans){
        int n = nums.length;
        if(ds.size() == n){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < ds.size(); i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!isvalid[i]){
                ds.add(nums[i]);
                isvalid[i] = true;
                helper(nums, ds, isvalid, ans);
                isvalid[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isvalid = new boolean[nums.length];
        helper(nums, ds, isvalid, ans);
        return ans;
    }
}