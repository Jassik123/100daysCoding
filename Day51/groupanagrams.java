class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> mp=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();

        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sorted =new String(ch);

            if(mp.containsKey(sorted)){
                ans.get(mp.get(sorted)).add(str);
            }else{
                mp.put(sorted,ans.size());
                ans.add(new ArrayList<>(Arrays.asList(str)));
            }
        }
        return ans;

            }
}