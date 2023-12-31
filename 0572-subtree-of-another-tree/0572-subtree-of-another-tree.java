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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(subRoot == null){
            return true;
        }
        if(getSubtree(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }
    public boolean getSubtree(TreeNode root, TreeNode subRoot){
        if(root ==null && subRoot ==null ){
            return true;
        }
        if(root !=null && subRoot != null && root.val == subRoot.val){ 
            boolean left = getSubtree(root.left, subRoot.left);
            boolean right = getSubtree(root.right, subRoot.right);
            return left && right;
        }
        return false;
        
    }
}