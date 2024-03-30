class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int sub=Atmostk(nums,k);
        int reduce=Atmostk(nums,k-1);
        return sub-reduce;
    }
    public static int Atmostk(int[] nums,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int left=0,right=0,ans=0;

        while(right<nums.length){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);

            while(mp.size()>k){
                mp.put(nums[left],mp.get(nums[left])-1);
                if(mp.get(nums[left])==0){
                    mp.remove(nums[left]);
                }
                left++;
            }
            ans+=right-left+1;
            right++;
        }
        return ans;
    }
}