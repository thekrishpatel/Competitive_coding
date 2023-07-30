class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        while (temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }
        al.sort(Comparator.naturalOrder());
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = al.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}