package LV2_75.LongestPalindromebyConcatenatingTwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }

        int len = 0;
        boolean middle = false;

        HashSet<String> used = new HashSet<>();

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getKey().toCharArray()[0] == entry.getKey().toCharArray()[1]) { // aa
                if (entry.getValue() > 1) {
                    len += ((entry.getValue() / 2) * 2) * 2 ;
                }
                if ((entry.getValue() - (entry.getValue() / 2) * 2) == 1) {
                    middle = true;
                }
            } else { // ab, ba
                StringBuffer sb = new StringBuffer(entry.getKey());
                String reverse = sb.reverse().toString();

                if (map.containsKey(reverse)) {
                    if (!used.contains(reverse) && !used.contains(entry.getKey())) {
                        int multi = Math.min(entry.getValue(), map.get(reverse));
                        len += 2 * (multi * 2);
                    }
                    used.add(reverse);
                    used.add(entry.getKey());
                }
            }
        }

       return middle? len + 2 : len;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        s.longestPalindrome(new String[] {"lc","cl","gg"});
    }
}