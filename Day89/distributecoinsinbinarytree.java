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
    public static int dfs(TreeNode root,TreeNode parent){
        if(root==null){
            return 0;
        }
        int moves=dfs(root.left,root)+dfs(root.right,root);
        int fro=root.val-1;
        parent.val+=fro;
        moves+=Math.abs(fro);
        return moves;

    }
    public int distributeCoins(TreeNode root) {
        TreeNode a=new TreeNode();
        return dfs(root,a);
    }
}