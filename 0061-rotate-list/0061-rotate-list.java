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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0) {
            return head; // No rotation needed
        }
        LinkedList<Integer> list=new LinkedList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        
        int length=list.size();
        k = k % length; // Get the effective number of rotations
        if (k == 0) {
            return head; // No rotation needed
        }
        
        for(int i=1;i<=k;i++){
            int last=list.getLast();
            list.removeLast();
            list.addFirst(last);
        }
          ListNode newHead = new ListNode(list.removeFirst());
        ListNode current = newHead;
        while (!list.isEmpty()) {
            current.next = new ListNode(list.removeFirst());
            current = current.next;
        }
        
        return newHead;
    }
}