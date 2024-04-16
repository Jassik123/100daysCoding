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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if (depth == 1) {
            TreeNode top = new TreeNode(val);
            top.left = root;
            return top;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

       
        for (int i = 1; i < depth - 1; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode leftNode = node.left;
            TreeNode rightNode = node.right;

            node.left = new TreeNode(val);
            node.right = new TreeNode(val);

            node.left.left = leftNode;
            node.right.right = rightNode;
        }

        return root;
    }
}