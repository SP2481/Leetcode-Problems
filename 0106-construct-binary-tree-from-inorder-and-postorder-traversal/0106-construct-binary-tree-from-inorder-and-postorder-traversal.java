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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0){
            return null;
        }
        int lastEle = postorder.length - 1;
        TreeNode root = new TreeNode(postorder[lastEle]);
        int mid = 0;
        for(int i =0 ; i < inorder.length; i++){
            if(postorder[lastEle] == inorder[i]){mid = i;}
        }
        root.left = 
        buildTree(Arrays.copyOfRange(inorder,0, mid ), Arrays.copyOfRange(postorder,0, mid));
        root.right = 
        buildTree(Arrays.copyOfRange(inorder, mid + 1, inorder.length), Arrays.copyOfRange(postorder,mid, postorder.length - 1 ));
        return root;
    }
}