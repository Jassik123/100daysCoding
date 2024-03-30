class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.replaceAll("\\s", " ").toLowerCase();
        t=t.replaceAll("\\s"," ").toLowerCase();
        if(s.length()!=t.length()) return false;
        char[] scharArray=s.toCharArray();
        char[] tcharArray=t.toCharArray();

        Arrays.sort(scharArray);
        Arrays.sort(tcharArray);

        return Arrays.equals(scharArray,tcharArray);
    }
}