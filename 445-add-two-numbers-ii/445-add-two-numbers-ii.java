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
    
    private int sum(int a, int b, int carry) {
        return a+b+carry;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        ListNode l3 = new ListNode();
        ListNode head = l3;
        
        while(l1 != null || l2 != null) {
            
            if (l1 != null) {
                s1.push(l1.val);
                l1 = l1.next;
            }
            
            if (l2 != null) {
                s2.push(l2.val);
                l2 = l2.next;
            }
        }
        
        int carry = 0;
        
        while(!s1.empty() || !s2.empty() || carry == 1) {
            int a=0, b=0;
            if (!s1.empty()) {
                a = s1.pop();
            }
            if (!s2.empty()) {
                b = s2.pop();
            }
            
            int sum = sum(a, b, carry);
            carry = sum/10;
            sum = sum%10;
            s3.push(sum);
        }
        
        while(!s3.empty()) {
            ListNode node = new ListNode(s3.pop());
            head.next = node;
            head = head.next;
        }
        
        return l3.next;
    }
}