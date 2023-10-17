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
    
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){return 0;}
        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> result = inorderTraversal(root, arr);
        return result.get(k - 1);
    }
    private ArrayList<Integer> inorderTraversal(TreeNode node, ArrayList<Integer> arr){
        if(node != null){
            inorderTraversal(node.left, arr);
            arr.add(node.val);
            inorderTraversal(node.right, arr);
        }
        return arr;
    }
}