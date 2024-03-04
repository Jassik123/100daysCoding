class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums) st.add(num);
        int maxi=0;
        for(int num:st){
            if(!st.contains(num-1)){
                int currnum=num;
                int current=1;
                while(st.contains(currnum+1)){
                    current++;
                    currnum++;
                }
                maxi=Math.max(maxi,current);
            }
        }
        return maxi;
        
    }
}