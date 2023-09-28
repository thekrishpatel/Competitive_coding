import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int curr = nums[0];
        int count = 0;
        int max_count = 0;
        int max_num = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != curr) {
                curr = nums[i];
                count = 0;
            } else {
                count++;
            }
            if (count > max_count) {
                max_count = count;
                max_num = nums[i];
            }
        }
        if (max_num == 0) {
            return curr;
        }
        return max_num;
    }
}