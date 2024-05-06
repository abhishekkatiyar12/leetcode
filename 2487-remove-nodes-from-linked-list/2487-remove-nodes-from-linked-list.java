class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node
        }
        
        // Step 1: Reverse the linked list
        ListNode reversedHead = reverseList(head);
        
        // Step 2: Traverse the reversed list and remove nodes with greater values to the right
        ListNode current = reversedHead;
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE); // Sentinel value to handle end of list
        
        while (current != null) {
            if (current.val >= maxStack.peek()) {
                // This node should be kept in the modified list
                maxStack.push(current.val);
            }
            current = current.next;
        }
        
        // Step 3: Rebuild the modified list based on the values in maxStack
        ListNode result = null;
        while (!maxStack.isEmpty()) {
            int value = maxStack.pop();
            if (value != Integer.MIN_VALUE) {
                ListNode newNode = new ListNode(value);
                newNode.next = result;
                result = newNode;
            }
        }
        
        // Step 4: Reverse the modified list to restore the original order
        return reverseList(result);
    }
    
    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev; // 'prev' is the new head of the reversed list
    }
}
