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
    public int getDecimalValue(ListNode head) {
            if (head == null) {
            return 0;
        }

        // Calculate the length of the linked list
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Traverse the linked list again to calculate the decimal value
        temp = head;
        int decimal = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (temp.val == 1) {
                decimal += Math.pow(2, i);
            }
            temp = temp.next;
        }

        return decimal;
    }
}