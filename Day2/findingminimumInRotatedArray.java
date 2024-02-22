class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(nums[mid]<=nums[n-1]){
              ans = Math.min(ans, nums[mid]);
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}