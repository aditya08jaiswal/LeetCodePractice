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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return head;
        } else if (head.next == null) {
            return null;
        }
        
        ListNode prev = head;
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (fast == null) {
            prev.next = slow.next;
        } else if (fast.next == null) {
            slow.next = slow.next.next;
        }
        
        return head;
        
    }
}