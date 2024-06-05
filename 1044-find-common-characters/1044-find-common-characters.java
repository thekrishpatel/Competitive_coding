import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> common = new ArrayList<>();
        if (words.length == 0)
            return common;
        for (char c = 'a'; c <= 'z'; c++) {
            boolean isCommon = false;
            for (int i = 0; i < words.length; i++) {
                if (words[i].contains(String.valueOf(c))) {
                    isCommon = true;
                    words[i] = words[i].replaceFirst(String.valueOf(c), "");
                    System.out.println(words[i]);
                } else {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                common.add(String.valueOf(c));
                c--;
            }
        }
        return common;
    }
}