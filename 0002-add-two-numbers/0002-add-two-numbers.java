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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry=0,val,nodeVal;
        
        ListNode result=new ListNode(0);
        ListNode curr=result;
        ListNode curr1,curr2;
        curr1=l1;
        curr2=l2;
        
        while(curr1!=null  ||  curr2!=null){
            int val1=curr1!=null?curr1.val:0;
            int val2=curr2!=null?curr2.val:0;
            val=carry+val1+val2;
             carry=val/10;
            nodeVal=val%10;
            curr.next=new ListNode(nodeVal);
            
            curr=curr.next;
            
            
            
          if(curr1!=null)  curr1=curr1.next;
          if(curr2!=null)  curr2=curr2.next;
        }
        if(carry>0){
            curr.next=new ListNode(carry);
            curr=curr.next;
        }
      
        
        return result.next;
        
}
        }