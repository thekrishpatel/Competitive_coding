class Solution {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];
        int j = 0;
        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            temp[j] = nums[i];
            j++;
        }
        j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i >= k)
                nums[i] = nums[i - k];
            else {
                nums[i] = temp[j];
                j++;
            }
        }
    }
}