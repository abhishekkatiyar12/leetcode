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
    public boolean isPalindrome(ListNode head) {
       Stack<Integer> s=new Stack<>();
        
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            s.push(slow.val);
             slow=slow.next;
            fast=fast.next.next;
        }
        
        if(fast!=null){
            slow=slow.next;
        }
        
        while(slow!=null){
            int temp=s.pop();
            if(temp!=slow.val){
                return false;
            }
            slow=slow.next;
        }
        return true;
       
    }
}