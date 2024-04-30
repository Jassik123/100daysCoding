class Solution {
   
    public long wonderfulSubstrings(String word) {
       int[] count=new int[1024];
       int mask=0;
       count[0]=1;
       long res=0;
       for(char c:word.toCharArray()){
        mask ^=1<<(c-'a');
        res +=count[mask];
        for(int i=0;i<10;i++){
            res+=count[mask^(1<<i)];
        }
        count[mask]++;
       } 
       return res;
    }
}