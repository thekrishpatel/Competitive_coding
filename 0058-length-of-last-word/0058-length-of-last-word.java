class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        int count = 0;
        for (int i = 0; i < s1[s1.length - 1].length(); i++) {
            count++;
        }
        return count;
    }
}