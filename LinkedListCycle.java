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
    public ListNode detectCycle(ListNode head) {
        ListNode slow;
        ListNode fast;

        if (head == null || head.next ==null) {
            return null;
        }

        ListNode prev= head;
        slow =head;
        fast =head;

        while (fast!=null && fast.next!=null) {
            slow =slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                slow=head;
                while(fast!=slow) {
                    slow = slow.next;
                    fast= fast.next;
                }

                return slow;
            }
        }

        return null;

        
    }
}
