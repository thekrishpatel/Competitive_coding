import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int singleNumber(int[] nums) {
        Queue<Integer> al = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!al.contains(nums[i])) {
                al.add(nums[i]);
            } else {
                al.remove(nums[i]);
            }
        }
        return al.peek();
    }
}