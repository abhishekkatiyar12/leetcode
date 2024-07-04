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
    public ListNode mergeNodes(ListNode head) {
        ListNode result = new ListNode();
        ListNode A = result;
        int temp = 0;

        // Start from head.next to skip the leading zero
        head = head.next;

        while (head != null) {
            if (head.val != 0) {
                temp += head.val; // Accumulate values until we hit a zero
            } else {
                A.next = new ListNode(temp); // Create a new node with the accumulated value
                A = A.next; // Move to the new node
                temp = 0; // Reset temp for the next segment
            }
            head = head.next; // Move to the next node
        }

        return result.next; // Skip the dummy node
    }
}