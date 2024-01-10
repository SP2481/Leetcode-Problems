/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    //using bfs convert the tree into map of adjacent nodes 
    private Map<Integer, List<Integer>> adjacent = new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        convertIntoMap(root);
        //dequeue to add to node value and keep track
        Deque<Integer> queue = new ArrayDeque<>();
        // set for the visited nodes
        Set<Integer> set = new HashSet<>();
        queue.offer(start);
        int time = -1; //start node is infected already
        while(!queue.isEmpty()){
            time++; 
            for(int i = queue.size(); i > 0; i--){ //loop through the queue top to bottom
                  int currentNode = queue.pollFirst(); //get first node
                  set.add(currentNode); // add that node value to visited

                  if(adjacent.containsKey(currentNode)){ // if map contains the current node then 
                      for(int neighbour : adjacent.get(currentNode)){ // loop through list of adjacent
                          if(!set.contains(neighbour)){ // if set does not contains 
                              queue.offer(neighbour);
                          }
                      }
                  }  
            }
        }
        return time;
    }
    private void convertIntoMap(TreeNode root){
        if(root == null){return;};
        if(root.left != null){
            adjacent.computeIfAbsent(root.val, n -> new ArrayList<>()).add(root.left.val);
            adjacent.computeIfAbsent(root.left.val, n -> new ArrayList<>()).add(root.val);
        }
        if(root.right != null){
            adjacent.computeIfAbsent(root.val, n -> new ArrayList<>()).add(root.right.val);
            adjacent.computeIfAbsent(root.right.val, n -> new ArrayList<>()).add(root.val);
        }
        convertIntoMap(root.left);
        convertIntoMap(root.right);
    }
}