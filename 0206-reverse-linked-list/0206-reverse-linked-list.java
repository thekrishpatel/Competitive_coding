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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        temp = head;
        int[] a = new int[count];
        int i = 0;
        while (temp != null) {
            a[i] = temp.val;
            temp = temp.next;
            i++;
        }
        temp = head;
        for (int j = count-1; j >= 0; j--) {
            temp.val = a[j];
            if (temp.next == null)
                break;
            temp = temp.next;
        }
        return head;
    }
}