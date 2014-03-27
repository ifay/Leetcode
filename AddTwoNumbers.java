/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
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
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null || l2 == null ) {
            return l1 == null ? l2 : l1;
        }
        ListNode sum = new ListNode(0);
        ListNode curSum = sum;
        int carry = 0;
        while(l1 != null && l2 != null) {
            curSum.next = new ListNode((l1.val + 2.val + carry)%10);
            carry =(int) (curl1.val + curl2.val + carry)/10;
            l1 = l1.next;
            l2 = l2.next;
            curSum = curSum.next;
        }
        if (l1 != null) {
            if (carry != 0) {
                curSum.next = addTwoNumbers(l1, new ListNode(carry));
            } else {
                curSum.next = l1;
            }
        } else if (l2 != null ) {
            if (carry != 0) {
                curSum.next = addTwoNumbers(l2, new ListNode(carry));
            } else {
                curSum.next = l2;
            }        }
        return sum.next;
    }
}