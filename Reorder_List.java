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
    public void reorderList(ListNode head) {
        ListNode Dummy = new ListNode(-1);
        ListNode currr = Dummy;

        ListNode prev,slow,fast,curr;
        prev = head;
        slow = head;
        fast = head;
        curr = head;
        while(fast!= null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            curr = fast;
            fast = fast.next.next;
        }

        if (fast == null) {
            fast = curr.next;
        }

    
        System.out.println("slow" + prev.val );
        System.out.println("fast" + fast.val);

        ListNode start = prev.next;
        prev.next = null;

        ListNode p = null;
        ListNode c = start;


        while (c != null) {
            ListNode temp = c.next;
            c.next = p;
            p = c;
            c = temp;
        } 

        ListNode r2 = p;
        ListNode r1 = head;

     //   while (r!=null) {
     //       System.out.println("rev" + r.val);
     //       r = r.next;
     //   }

        while(r1 != null || r2 != null) {
            if (r1 != null) {
                currr.next = r1;
                currr = r1;
                r1 = r1.next;
            }

            if (r2 != null) {
                currr.next = r2;
                currr = r2;
                r2 = r2.next;
            }
        }

         

        head = Dummy.next;

    }
}
