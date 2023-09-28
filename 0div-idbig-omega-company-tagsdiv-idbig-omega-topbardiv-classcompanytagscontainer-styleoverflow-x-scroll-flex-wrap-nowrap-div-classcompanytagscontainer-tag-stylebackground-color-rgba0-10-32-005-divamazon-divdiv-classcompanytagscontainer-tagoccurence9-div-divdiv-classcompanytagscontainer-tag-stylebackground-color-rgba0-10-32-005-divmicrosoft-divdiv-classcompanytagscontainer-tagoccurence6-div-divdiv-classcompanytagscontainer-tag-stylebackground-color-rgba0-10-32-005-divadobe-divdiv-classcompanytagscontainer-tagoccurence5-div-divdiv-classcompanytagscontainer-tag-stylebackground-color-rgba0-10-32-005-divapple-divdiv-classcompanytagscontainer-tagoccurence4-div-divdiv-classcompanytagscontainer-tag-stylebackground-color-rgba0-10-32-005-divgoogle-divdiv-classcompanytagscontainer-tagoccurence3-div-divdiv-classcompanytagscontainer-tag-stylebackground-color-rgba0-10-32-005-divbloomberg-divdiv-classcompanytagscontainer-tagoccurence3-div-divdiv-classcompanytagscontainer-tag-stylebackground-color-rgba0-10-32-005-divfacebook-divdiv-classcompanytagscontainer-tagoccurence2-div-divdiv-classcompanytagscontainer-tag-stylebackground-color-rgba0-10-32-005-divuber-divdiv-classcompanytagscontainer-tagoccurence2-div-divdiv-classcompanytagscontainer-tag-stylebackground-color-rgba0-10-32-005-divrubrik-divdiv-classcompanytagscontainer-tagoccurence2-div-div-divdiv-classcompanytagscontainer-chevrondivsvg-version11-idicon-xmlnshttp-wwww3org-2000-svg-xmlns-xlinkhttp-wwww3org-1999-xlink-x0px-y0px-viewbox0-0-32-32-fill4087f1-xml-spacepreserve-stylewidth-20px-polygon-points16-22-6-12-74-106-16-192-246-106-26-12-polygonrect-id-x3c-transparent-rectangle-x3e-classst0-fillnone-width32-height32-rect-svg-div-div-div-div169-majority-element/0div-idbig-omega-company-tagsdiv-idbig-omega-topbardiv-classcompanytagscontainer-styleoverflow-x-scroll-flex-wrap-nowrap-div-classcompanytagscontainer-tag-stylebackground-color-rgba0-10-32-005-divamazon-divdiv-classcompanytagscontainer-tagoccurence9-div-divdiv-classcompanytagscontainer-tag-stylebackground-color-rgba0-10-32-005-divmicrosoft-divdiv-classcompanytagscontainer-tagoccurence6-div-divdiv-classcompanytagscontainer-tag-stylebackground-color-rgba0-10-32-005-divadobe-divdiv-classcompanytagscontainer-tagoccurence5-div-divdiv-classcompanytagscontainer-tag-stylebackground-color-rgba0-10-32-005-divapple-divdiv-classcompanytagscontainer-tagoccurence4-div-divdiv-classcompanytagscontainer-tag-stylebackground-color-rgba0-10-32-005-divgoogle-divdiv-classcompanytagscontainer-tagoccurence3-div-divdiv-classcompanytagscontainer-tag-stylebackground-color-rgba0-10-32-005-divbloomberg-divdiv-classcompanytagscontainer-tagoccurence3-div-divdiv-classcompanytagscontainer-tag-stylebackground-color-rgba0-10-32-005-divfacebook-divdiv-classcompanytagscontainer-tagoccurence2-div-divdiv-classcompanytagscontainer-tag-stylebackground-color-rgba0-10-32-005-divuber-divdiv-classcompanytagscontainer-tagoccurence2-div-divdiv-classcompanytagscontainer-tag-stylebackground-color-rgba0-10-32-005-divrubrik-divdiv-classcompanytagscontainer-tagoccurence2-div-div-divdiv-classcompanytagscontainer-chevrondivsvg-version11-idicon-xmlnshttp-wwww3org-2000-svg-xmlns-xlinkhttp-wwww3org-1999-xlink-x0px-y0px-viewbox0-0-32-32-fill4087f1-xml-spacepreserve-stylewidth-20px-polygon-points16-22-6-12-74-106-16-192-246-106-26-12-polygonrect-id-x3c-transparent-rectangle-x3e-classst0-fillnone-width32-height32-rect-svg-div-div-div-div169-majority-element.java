class Solution {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
                cur = nums[i];
            } else if (cur == nums[i]) {
                count++;
            } else
                count--;
        }
        return cur;
    }
}