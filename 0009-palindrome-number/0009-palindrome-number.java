class Solution {
    public static boolean isPalindrome(int x) {
        long ans = 0;
        int temp = x;
        while (temp > 0) {
            ans = ans * 10 + (temp % 10);
            temp /= 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return false;
        } else {
            return (int) ans == x;
        }
    }
}