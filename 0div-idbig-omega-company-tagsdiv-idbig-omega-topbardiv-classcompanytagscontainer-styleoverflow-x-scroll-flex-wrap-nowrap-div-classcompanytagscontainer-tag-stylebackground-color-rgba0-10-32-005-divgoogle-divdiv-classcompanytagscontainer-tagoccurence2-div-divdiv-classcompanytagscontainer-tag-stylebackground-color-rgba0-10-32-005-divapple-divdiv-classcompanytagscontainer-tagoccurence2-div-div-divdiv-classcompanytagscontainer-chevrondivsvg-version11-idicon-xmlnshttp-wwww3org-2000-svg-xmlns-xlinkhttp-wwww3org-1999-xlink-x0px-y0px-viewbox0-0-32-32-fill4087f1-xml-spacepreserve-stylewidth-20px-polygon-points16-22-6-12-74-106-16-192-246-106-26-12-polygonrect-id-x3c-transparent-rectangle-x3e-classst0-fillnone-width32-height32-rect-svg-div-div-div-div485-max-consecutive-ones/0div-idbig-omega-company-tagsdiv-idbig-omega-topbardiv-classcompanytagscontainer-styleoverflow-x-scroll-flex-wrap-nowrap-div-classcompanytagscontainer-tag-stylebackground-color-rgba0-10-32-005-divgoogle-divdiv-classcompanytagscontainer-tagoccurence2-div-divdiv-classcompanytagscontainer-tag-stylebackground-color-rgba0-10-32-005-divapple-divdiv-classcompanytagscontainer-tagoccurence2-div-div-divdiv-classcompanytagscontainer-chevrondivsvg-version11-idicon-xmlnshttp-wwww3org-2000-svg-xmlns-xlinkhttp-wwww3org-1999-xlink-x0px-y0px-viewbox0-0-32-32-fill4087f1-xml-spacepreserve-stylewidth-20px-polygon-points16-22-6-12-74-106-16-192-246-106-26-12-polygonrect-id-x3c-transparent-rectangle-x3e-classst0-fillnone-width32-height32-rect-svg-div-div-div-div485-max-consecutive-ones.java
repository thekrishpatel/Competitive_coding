class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int auc = 0;
        int max_auc = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                auc = 0;
            } else {
                auc++;
            }
            if (auc > max_auc) {
                max_auc = auc;
            }
        }
        return max_auc;
    }
}