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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> m = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (ListNode x : lists) {
            if (x != null) {
                 m.offer(x);
            }     
        }

        ListNode Dumpy = new ListNode(-1);
        ListNode curr = Dumpy;

        while (!m.isEmpty()) {
            ListNode x =  m.poll();
            curr.next = x;
            curr = curr.next;
            
             if (x.next != null) {
                m.offer(x.next); // insert next node from the same list
            }   
        }

        return Dumpy.next;
        
        
    }
}
