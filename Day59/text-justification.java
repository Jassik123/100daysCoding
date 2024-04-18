class Solution {
    int Max_Width;
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result=new ArrayList<>();
        int n=words.length;
         Max_Width=maxWidth;
        int i=0;
        while(i<n){
            int lettercount=words[i].length();
            int j=i+1;
            int spaces=0;
            while(j<n && spaces+lettercount+words[j].length()+1<=maxWidth){
                lettercount+=words[j].length();
                spaces+=1;
                j++;
            }
            int remaining=maxWidth-lettercount;

            int eachword= spaces==0?0:remaining/spaces;
            int extra=spaces==0?0:remaining%spaces;

            if(j==n){
                eachword=1;
                extra=0;
            }
            result.add(getfinal(i,j,eachword,extra,words));
            i=j;
            
        }
        return result;


    }
    private String getfinal(int i,int j,int eachword,int extra,String[] words){
        StringBuilder sb=new StringBuilder();
        for(int k=i;k<j;k++){
            sb.append(words[k]);

            if(k!=j-1){
          
            
            for(int a=1;a<=eachword;a++){
                sb.append(" ");
            }
                if(extra>0){
                    sb.append(" ");
                    extra--;
                }
            }
        }
            while(sb.length()<Max_Width){
                sb.append(" ");
            
           
        }
         return sb.toString();
    }
}