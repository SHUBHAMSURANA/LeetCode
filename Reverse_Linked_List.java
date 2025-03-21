class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null; // No need to reverse if the list is empty
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next; // Save the next node
            curr.next = prev;          // Reverse the link
            prev = curr;               // Move prev forward
            curr = temp;               // Move curr forward
        }

        // prev is the new head at the end of the loop
        return prev;
    }
}
