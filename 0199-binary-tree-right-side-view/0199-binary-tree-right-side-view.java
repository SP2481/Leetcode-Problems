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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root == null){
            return arr;
        }
        rightside(root, arr, 0);
        return arr;

    }
    private void rightside(TreeNode root, List<Integer> ans, int i){
        if(root  == null) return;
        if(i == ans.size()){
            ans.add(root.val);
        }
        rightside(root.right, ans, i+1);
        rightside(root.left, ans, i+1);
    }
}