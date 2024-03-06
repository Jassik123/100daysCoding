class Solution {
    public int findDuplicate(int[] nums) {
       int n=nums.length;
    
       int[] ans=new int[nums.length+1];
       for(int i=0;i<n;i++){
           if(ans[nums[i]]==1){
               return nums[i];
           }else{
               ans [nums[i]]++;
           }
       }
       return 0;
    }
        
    }
