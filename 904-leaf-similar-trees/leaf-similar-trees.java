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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        findSimilar(list1, root1);
        findSimilar(list2, root2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
    private void findSimilar(List<Integer> list, TreeNode root){
        if(root == null) return;
        
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }else{
            findSimilar(list, root.left);
            findSimilar(list, root.right);

        }

    }
}