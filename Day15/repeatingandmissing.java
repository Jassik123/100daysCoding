public int[] repeatedNumber(final int[] A) {
        long n=A.length;
        long Sn=(n*(n+1))/2;
        long S2n=(n*(n+1)*(2*n+1))/6;
        long s=0,s2=0;
        for(int i=0;i<n;i++){
            s+=A[i];
            s2+=(long) A[i] * (long) A[i];
        }
        
        long val1=Sn-s;
        long val2=(S2n-s2)/val1;
        
       
        
        long x=(val1+val2)/2;
        long y=x-val1;
        
        int[] ans={(int) y,(int) x};
        return ans ;
        
        
        