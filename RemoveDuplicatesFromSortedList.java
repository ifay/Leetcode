/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.

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
        if (head == null) {
            return head;
        }
        ListNode a = head.next;
        ListNode b = head;
        while(a!=null) {
            if (a.val != b.val) {
                // System.out.println(b.val+"->");
                a = a.next;
                b = b.next;
            } else {
                b.next = a.next;
                a = null;
                if (b != null) {
                    a = b.next;
                } else {
                    break;
                }
            }
        }
        // System.out.println(b.val);
        return head;
    }
}