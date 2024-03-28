class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int l=0;

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            while(mp.get(nums[i])>k){
                mp.put(nums[l],mp.get(nums[l])-1);
                l++;
            }
            ans=Math.max(ans,i-l+1);

        } 
        return ans;
    }
}