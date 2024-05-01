class Solution {
    public static void swap(StringBuilder sb,int i,int j){
        char temp=sb.charAt(i);
        sb.replace(i,i+1,""+sb.charAt(j));
          sb.replace(j,j+1,""+temp);

    }
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder(word);
        int first=word.indexOf(ch);
        int n=0;
        int l=first;
        while(n<l){
          swap(sb,n,l);
          n++;
          l--;
        }
        return sb.toString();
    }
}