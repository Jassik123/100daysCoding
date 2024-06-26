/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String smallestFromLeaf(TreeNode root) {
        String small="";
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> output=new ArrayList<>();
        traverse(root,list,output);

        for(List<Integer> ans:output){
            StringBuilder sb=new StringBuilder();
            for(Integer n:ans){
                char ch=(char)(n+'a');
                sb.append(ch);
            }
            String str=sb.reverse().toString();
            if(small.equals("")){
                small=str;
            }
            if(small.compareTo(str)>0){
                small=str;
            }
        }
        return small;
    }
    private void traverse(TreeNode root,ArrayList<Integer> list,List<List<Integer>> output){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right==null){
            output.add(new ArrayList(list));

            return;
        }
        traverse(root.left,new ArrayList(list),output);
         traverse(root.right,new ArrayList(list),output);

    }
}