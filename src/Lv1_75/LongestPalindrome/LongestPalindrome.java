package Lv1_75.LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] charsArray = s.toCharArray();
        HashMap<Character, Integer> chars = new HashMap();
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            char ith = charsArray[i];
            if (chars.containsKey(ith)) {
                chars.compute(ith, (k,v) -> v+1);
            } else {
                chars.put(ith, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
             int sum = (entry.getValue() / 2) * 2;
             length += sum;
             if (length % 2 == 0 && entry.getValue() % 2 == 1)
                 length++;
        }

        return length;
    }
}
