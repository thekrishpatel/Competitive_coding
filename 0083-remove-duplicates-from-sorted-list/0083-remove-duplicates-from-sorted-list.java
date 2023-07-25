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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if (temp != null && temp.next != null) {
            while (temp.next.next != null) {
                if (temp.val >= temp.next.val) {
                    temp.next = temp.next.next;
                    continue;
                }
                temp = temp.next;
            }
            if (temp.val >= temp.next.val)
                temp.next = null;
        }
        return head;
    }
}