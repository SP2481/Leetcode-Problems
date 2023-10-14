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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1]; // coz when you pass a int to a method or func it makes its compy and transfers it and when you pass array it passes array with reference to original array
        diameter[0] = 0;
        getdiameter(root, diameter);
        return diameter[0];
 
    }
    public int getdiameter(TreeNode root, int[] diameter){
            if(root == null){
                return 0;
            }
            
            int left = getdiameter(root.left, diameter);
            int right = getdiameter(root.right, diameter);
            diameter[0] = Math.max(diameter[0], left+right);
            return Math.max(left,right) + 1;
        }
}