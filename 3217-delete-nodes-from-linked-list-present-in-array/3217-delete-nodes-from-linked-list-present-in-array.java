class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Use HashSet for faster lookup of the nums array
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Remove nodes at the beginning of the list if their values are in the set
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }

        // If all nodes are removed, return null
        if (head == null) {
            return null;
        }

        // Traverse the rest of the list
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (set.contains(temp.next.val)) {
                temp.next = temp.next.next;  // Remove the node
            } else {
                temp = temp.next;  // Move to the next node
            }
        }

        return head;
    }
}