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
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }
        int i = 0;
        ListNode l = new ListNode(head.val);
        ListNode l2 = new ListNode(head.next.val);
        ListNode temp = head.next.next;
        ListNode temp1 = l;
        ListNode temp2 = l2;
        while (temp != null) {
            if (i % 2 == 0) {
                temp1.next = new ListNode(temp.val);
                temp1 = temp1.next;
            } else {
                temp2.next = new ListNode(temp.val);
                temp2 = temp2.next;
            }
            temp = temp.next;
            i++;
        }
        temp1.next = l2;
        return l;
    }
}