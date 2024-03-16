class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int zeroes=0;
        int ones=0;
        int max=0;

        mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroes++;
            else ones++;
            int diff=zeroes-ones;

            if(mp.containsKey(diff)){
                max=Math.max(max,i-mp.get(diff));
            }
            else{
                mp.put(diff,i);
            }
        }
        return max;
    }
}