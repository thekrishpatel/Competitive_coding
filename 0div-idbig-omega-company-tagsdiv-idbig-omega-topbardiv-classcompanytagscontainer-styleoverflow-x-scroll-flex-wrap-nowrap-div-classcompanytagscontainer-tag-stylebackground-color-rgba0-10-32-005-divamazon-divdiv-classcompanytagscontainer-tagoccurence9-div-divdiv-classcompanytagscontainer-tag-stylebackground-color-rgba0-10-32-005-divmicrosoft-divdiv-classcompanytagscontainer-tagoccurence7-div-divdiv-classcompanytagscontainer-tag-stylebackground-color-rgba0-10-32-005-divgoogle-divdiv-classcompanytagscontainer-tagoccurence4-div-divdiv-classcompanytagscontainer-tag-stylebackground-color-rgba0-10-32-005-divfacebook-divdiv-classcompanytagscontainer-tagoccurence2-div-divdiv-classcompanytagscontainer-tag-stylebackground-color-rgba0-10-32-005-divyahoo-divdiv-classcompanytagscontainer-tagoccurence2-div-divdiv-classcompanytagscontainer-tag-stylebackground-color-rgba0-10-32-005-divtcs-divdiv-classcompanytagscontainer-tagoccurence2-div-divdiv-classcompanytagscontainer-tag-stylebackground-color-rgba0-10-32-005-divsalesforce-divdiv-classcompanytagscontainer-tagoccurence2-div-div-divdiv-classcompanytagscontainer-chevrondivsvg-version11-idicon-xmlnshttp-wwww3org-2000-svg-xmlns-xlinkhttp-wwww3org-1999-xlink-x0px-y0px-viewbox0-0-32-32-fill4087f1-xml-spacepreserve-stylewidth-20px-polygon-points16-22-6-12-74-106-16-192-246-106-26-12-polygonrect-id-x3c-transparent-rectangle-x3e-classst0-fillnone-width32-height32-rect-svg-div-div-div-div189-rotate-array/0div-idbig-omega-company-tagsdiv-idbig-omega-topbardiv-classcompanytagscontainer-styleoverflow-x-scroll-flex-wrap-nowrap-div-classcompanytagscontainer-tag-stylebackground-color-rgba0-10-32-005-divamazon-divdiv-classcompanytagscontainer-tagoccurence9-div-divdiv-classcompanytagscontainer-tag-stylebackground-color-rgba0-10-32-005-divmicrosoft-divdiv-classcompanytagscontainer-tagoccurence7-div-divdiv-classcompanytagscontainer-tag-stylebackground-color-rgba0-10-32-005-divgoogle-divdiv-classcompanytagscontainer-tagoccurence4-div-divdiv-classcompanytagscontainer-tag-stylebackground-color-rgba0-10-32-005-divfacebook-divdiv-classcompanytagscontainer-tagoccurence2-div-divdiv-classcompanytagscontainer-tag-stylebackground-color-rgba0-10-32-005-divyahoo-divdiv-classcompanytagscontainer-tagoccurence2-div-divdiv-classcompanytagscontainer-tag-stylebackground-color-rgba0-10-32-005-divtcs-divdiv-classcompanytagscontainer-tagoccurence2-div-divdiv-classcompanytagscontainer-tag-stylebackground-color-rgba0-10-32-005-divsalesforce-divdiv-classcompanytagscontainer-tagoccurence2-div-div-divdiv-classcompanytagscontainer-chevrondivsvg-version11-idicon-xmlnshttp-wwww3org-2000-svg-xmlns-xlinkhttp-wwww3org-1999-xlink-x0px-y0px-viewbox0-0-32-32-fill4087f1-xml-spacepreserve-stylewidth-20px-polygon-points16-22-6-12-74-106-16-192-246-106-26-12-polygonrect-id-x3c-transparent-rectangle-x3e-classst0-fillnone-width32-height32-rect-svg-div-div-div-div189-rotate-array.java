class Solution {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];
        int j = 0;
        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            temp[j] = nums[i];
            j++;
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        j = 0;
        for (int i = k - 1; i >= 0; i--) {
            nums[i] = temp[j];
            j++;
        }
    }
}