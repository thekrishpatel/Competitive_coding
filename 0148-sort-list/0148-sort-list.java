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
        for (int i = 0; i < al.size(); i++) {
            temp.val = al.get(i);
            temp = temp.next;
        }
        return head;
    }
}