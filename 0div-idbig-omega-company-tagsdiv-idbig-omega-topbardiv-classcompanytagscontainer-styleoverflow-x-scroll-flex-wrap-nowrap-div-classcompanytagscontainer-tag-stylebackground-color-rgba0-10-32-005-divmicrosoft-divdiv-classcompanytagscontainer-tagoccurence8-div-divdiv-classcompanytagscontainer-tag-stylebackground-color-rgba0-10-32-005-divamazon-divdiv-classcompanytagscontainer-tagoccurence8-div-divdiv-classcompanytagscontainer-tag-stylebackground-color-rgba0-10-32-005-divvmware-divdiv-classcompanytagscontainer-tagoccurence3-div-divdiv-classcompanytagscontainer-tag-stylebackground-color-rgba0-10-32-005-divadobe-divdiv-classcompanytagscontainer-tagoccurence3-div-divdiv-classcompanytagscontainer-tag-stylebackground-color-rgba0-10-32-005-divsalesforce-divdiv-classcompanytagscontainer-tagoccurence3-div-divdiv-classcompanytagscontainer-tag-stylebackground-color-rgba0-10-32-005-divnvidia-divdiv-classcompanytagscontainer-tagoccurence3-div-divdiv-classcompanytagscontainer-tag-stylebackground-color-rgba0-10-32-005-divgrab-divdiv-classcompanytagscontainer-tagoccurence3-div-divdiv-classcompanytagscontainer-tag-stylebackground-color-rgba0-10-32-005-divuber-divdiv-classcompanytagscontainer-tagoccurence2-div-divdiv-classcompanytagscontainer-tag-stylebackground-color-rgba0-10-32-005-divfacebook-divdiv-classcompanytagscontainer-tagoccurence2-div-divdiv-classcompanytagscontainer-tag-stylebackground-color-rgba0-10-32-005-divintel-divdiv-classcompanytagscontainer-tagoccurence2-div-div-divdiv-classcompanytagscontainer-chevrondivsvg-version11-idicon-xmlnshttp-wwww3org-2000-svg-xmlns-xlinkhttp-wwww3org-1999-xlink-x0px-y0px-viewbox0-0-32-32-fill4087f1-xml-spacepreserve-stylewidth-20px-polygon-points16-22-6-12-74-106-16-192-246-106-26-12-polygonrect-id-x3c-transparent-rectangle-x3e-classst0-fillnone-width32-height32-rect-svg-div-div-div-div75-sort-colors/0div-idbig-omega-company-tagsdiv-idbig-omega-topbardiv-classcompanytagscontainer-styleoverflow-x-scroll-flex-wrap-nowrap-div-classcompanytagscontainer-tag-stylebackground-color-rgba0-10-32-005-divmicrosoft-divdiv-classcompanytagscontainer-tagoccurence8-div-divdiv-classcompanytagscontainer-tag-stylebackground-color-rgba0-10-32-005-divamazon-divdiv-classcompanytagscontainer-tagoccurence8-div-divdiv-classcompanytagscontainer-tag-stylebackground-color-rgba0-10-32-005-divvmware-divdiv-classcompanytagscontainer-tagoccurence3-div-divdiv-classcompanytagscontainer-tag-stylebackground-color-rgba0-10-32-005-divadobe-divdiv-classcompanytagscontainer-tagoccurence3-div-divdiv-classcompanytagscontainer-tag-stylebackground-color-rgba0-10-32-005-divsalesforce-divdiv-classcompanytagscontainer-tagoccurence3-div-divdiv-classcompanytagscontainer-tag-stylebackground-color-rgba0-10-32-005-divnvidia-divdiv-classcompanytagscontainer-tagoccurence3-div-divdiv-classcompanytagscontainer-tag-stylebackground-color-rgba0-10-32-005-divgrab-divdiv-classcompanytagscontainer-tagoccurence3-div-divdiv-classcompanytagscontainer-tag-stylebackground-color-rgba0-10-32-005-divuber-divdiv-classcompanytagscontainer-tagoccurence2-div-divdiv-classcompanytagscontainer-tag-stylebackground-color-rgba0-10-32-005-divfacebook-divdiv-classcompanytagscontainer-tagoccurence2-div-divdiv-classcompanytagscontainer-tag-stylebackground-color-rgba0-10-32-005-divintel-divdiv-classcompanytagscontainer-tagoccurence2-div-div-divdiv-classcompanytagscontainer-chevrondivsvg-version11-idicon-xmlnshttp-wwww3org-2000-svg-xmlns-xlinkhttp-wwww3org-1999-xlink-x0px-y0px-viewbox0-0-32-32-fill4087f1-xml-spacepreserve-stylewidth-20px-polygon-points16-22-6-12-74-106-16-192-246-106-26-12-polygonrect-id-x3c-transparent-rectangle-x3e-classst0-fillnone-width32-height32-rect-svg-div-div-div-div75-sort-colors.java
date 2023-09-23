class Solution {
    public void sortColors(int[] nums) {
        for (int i = nums.length; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}