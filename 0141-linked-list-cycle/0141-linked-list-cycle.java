/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      
        if (head == null) return false;

        ListNode slow = head;          // Tortoise
        ListNode fast = head;          // Hare

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move tortoise one step
            fast = fast.next.next;     // Move hare two steps

            if (slow == fast) {        // Cycle detected
                return true;
            }
        }
        return false;                 // No cycle found
    
    }
}