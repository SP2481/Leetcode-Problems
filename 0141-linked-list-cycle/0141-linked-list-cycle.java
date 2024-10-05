/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       Set<ListNode> visited  = new HashSet<>();
       ListNode curr = head;
       while(curr != null){
        if(!visited.contains(curr)) {
            visited.add(curr);
        } else {
        return true; 
       }
       curr = curr.next;
       }
       return false;

    }
}
