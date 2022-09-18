# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        
        curr = head.next;
        prev = head;
        
        while curr is not None:
            if prev.val != curr.val:
                prev = curr
            else:
                prev.next = curr.next
            curr = curr.next
        
        return head