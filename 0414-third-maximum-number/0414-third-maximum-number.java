class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!al.contains(nums[i]))
                al.add(nums[i]);
        }
        al.sort(Comparator.reverseOrder());
        if (al.size() == 1) {
            return al.get(0);
        } else if (al.size() == 2) {
            return al.get(0);
        } else {
            return al.get(2);
        }
    }
}