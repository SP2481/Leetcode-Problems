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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftSubtree = getdepth(root.left);
        int rightSubtree = getdepth(root.right);

        if(Math.abs(leftSubtree - rightSubtree) <= 1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }  
        return false;
    }

    public int getdepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getdepth(root.left);
        int right =  getdepth(root.right);
        return Math.max(left, right)+1;
    }
}