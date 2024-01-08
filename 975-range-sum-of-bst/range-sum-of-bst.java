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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        
        return helper(root, low, high);
    }
    private int helper(TreeNode root, int l, int h){
        if(root == null)return 0;
        int count =0;
        if(root.val >= l && root.val <= h){
            count+=root.val;
        }
        count+=helper(root.left, l, h);
        count+=helper(root.right, l, h);
        return count;
    }
}