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
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int max= root.val;
        return dfs(root, max);

    }

    private int dfs(TreeNode root, int max){
        if (root == null){
            return 0;
        }
        int goodNodes = 0;
        if(root.val >= max){
            goodNodes+=1;
        }
        max = Math.max(max, root.val);
        goodNodes += dfs(root.left, max);
        goodNodes += dfs(root.right, max);
        return goodNodes;
    }
}