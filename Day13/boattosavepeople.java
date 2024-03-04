class Solution {
    public int numRescueBoats(int[] people, int limit) {
      
        int count=0;
        Arrays.sort(people);
          int start=0;
        int end=people.length-1;
               while(start<=end){
           if(people[start]+people[end]<=limit){
             
               start++;
               count++;
               end--;
             
           }else{
               
               count++;
               end--;
           }
             
       }
       return count;
        
    }
}