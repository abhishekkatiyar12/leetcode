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
    public ListNode doubleIt(ListNode head) {
        
       ListNode newHead=reverse(head);
        ListNode result=doubleList(newHead);
        return result;
        
        
    }
    
    
    
    public ListNode reverse(ListNode Head){
        ListNode curr,next,prev;
        prev=null;
        curr=Head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    
    public ListNode doubleList(ListNode head){
         ListNode curr,newlist;
         curr=head;
        
        
         ListNode result=new ListNode();
        newlist=result;
        

        int val=0,carry=0,count=0;;
        while(curr!=null){
            ListNode temp=new ListNode();
            
            val=curr.val;
            val+=val;
            val+=carry;
            temp.val=val%10;
            carry=val/10;
            curr=curr.next;
            newlist.next=temp;
            newlist=temp;
        }
        result=result.next;
        if(carry==1){
           ListNode r1= reverse(result);
            ListNode n1=new ListNode();
            n1.val=carry;
            n1.next=r1;
            return n1;
        }else{
            return reverse(result);
        }
        // return result;
    }
   
    
}