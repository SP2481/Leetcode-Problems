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
    public int maxAncestorDiff(TreeNode root) {
        if (root == null){
            return 0;
        }
        int min = root.val, max = root.val, diff = Integer.MIN_VALUE;

        return findMaxdiff(root, min, max, diff);
        
    }
    private int findMaxdiff(TreeNode root, int min, int max, int diff){
        if(root == null) return diff;
        int leftDiff = findMaxdiff(root.left, Math.min(min, root.val), Math.max(max, root.val), diff);
        int rightDiff = findMaxdiff(root.right, Math.min(min, root.val), Math.max(max, root.val), diff);  
        return Math.max(Math.max(Math.abs(min - root.val), Math.abs(max - root.val)), Math.max(leftDiff, rightDiff));
    }
}