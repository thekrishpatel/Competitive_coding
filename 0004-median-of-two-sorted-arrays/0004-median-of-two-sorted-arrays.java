class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            al.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            al.add(nums2[i]);
        }
        al.sort(Comparator.naturalOrder());
        int a;
        int b;
        if (al.size() % 2 == 0) {
            a = al.get(al.size() / 2 - 1);
            b = al.get(al.size() / 2);
            ans = (double) (a + b) / 2;
        } else {
            a = al.get(al.size() / 2);
            ans = (double) a;
        }
        return ans;
    }
}