/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // find the middle elemetn of the list
        while (fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }

        //reverse the second list 
        ListNode secondList = slow.next;
        ListNode prev = null;
        slow.next = null;
        while(secondList != null){
            ListNode tmp = secondList.next;
            secondList.next = prev;
            prev = secondList;
            secondList = tmp;
        }
        ListNode first = head;
        secondList = prev;
        while(secondList != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = secondList.next;
            first.next = secondList;
            secondList.next = tmp1;
            first = tmp1;
            secondList = tmp2;
        }
    }
}