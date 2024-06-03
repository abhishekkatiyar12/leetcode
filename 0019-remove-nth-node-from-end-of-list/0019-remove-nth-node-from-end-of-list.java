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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Reverse the linked list
        ListNode NewHead = reverseLinkedList(head);
        ListNode curr = NewHead;
        
        // Special case: if removing the first node in the reversed list
        if (n == 1) {
            NewHead = NewHead.next;  
        } else {
            int count = 1;
            while (curr != null && count < n - 1) {
                curr = curr.next;
                count++;
            }
            if (curr != null && curr.next != null) {
                curr.next = curr.next.next; 
            }
        }
        
        // Reverse the list again to restore original order
        head = reverseLinkedList(NewHead);
        return head;
    }
    
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next; // Store the next node
            current.next = prev;          // Reverse the current node's pointer
            prev = current;               // Move prev and current one step forward
            current = next;
        }
        return prev; // prev becomes the new head of the reversed list
    }
}
