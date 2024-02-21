public class Solution {
    public int[] solve(int[] A, int B) {

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        Long sum =0L;
        int startindex = -1;
        int lastindex = -1;
        for(int i =0; i<A.length; i++) 
        {
          sum+=A[i];
          if(map.containsKey(sum-B)) 
          {
        	  startindex = map.get(sum-B)+1;
        	  lastindex=i;
        	  break;
          }
          else {map.put(sum, i);}
        }
        
        int [] ans = new int[lastindex+1-startindex];
        if(lastindex!=-1) 
        {   int k =0; 
        	for(int i =startindex; i<=lastindex; i++) 
        	{
        		ans[k]= A[i];
        		k++;
        	}
        	return ans;
        }
        else return new int[]{-1};
    }
}
