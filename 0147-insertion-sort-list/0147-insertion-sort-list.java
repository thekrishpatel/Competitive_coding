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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        while (temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }
        al.sort(Comparator.naturalOrder());
        temp = head;
        for (int i = 0; i < al.size(); i++) {
            temp.val = al.get(i);
            temp = temp.next;
        }
        return head;
    }
}