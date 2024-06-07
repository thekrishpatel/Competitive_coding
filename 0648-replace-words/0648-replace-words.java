class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        for (String dict : dictionary) {
            for (int i = 0; i < words.length; i++) {
                if (words[i].startsWith(dict)) {
                    words[i] = dict;
                }
            }
        }
        return String.join(" ", words);
    }
}