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
    public int maxDepth(TreeNode root) {
        // LEVEL ORDER TRAVERSAL
        if(root == null){
            return 0;
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level = 0; // Initialize level to 0
    
        while (!q.isEmpty()) { // Check if the queue is empty
            int size = q.size(); // Get the current level's node count
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            level++; // Increment the level after processing each level's nodes
        }
    
        return level;
  
    }
}