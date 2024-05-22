class Solution {
    private static boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }
        }
        return true;
    }


    private static void backtrack(String s,int start,List<String> path,List<List<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=start+1;i<=s.length();i++){
            if(isPalindrome(s,start,i-1)){
                path.add(s.substring(start,i));

                backtrack(s,i,path,result);
                path.remove(path.size()-1);

            }

        }
        
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }
}