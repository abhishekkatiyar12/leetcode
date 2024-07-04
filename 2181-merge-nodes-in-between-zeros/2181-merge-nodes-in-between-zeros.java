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
        ListNode result=new ListNode();
        ListNode A=result;
        int temp=0;
        head=head.next;
        while(head!=null){
        temp+=head.val;
            if(head.val==0){
                A.next= new ListNode(temp);
                A=A.next;
                temp=0;
            }
            head=head.next;
        }
        return result.next;
    }
}