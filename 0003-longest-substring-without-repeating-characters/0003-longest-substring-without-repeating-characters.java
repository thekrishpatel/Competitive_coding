import java.util.Set;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int result = 0;
        Set<Character> chars = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!chars.contains(c)) {
                chars.add(c);
                right++;
                result = Math.max(result, right - left);
            } else {
                chars.remove(s.charAt(left));
                left++;
            }
        }
        return result;
    }
}
