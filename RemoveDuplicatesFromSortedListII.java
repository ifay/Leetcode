/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * 
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveDuplicatesFromSortedList {
   public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            //null and one node array
            return head;
        }
        
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start;
        ListNode fast = slow.next;
        
        while(fast.next != null) {
            if (slow.next.val == fast.next.val) {
                fast = fast.next;
                if (fast.next == null) {
                    slow.next = fast.next;
                }
                
            } else {
                if(slow.next != fast) {
                    slow.next = fast.next;
                } else {
                    slow = slow.next;
                }
                fast = fast.next;
            }
        }
        return start.next;
    }
}