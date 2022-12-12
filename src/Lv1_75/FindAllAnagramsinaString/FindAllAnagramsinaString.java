package Lv1_75.FindAllAnagramsinaString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        if (p.length() > s.length()) return new ArrayList<>();

        HashMap<Character, Integer> pletters = returnMap(p, 0, p.length()-1);
        HashMap<Character, Integer> sletters = new HashMap<>();
        ;
        List<Integer> indexes = new ArrayList<>();

        sletters = returnMap(s, 0 , p.length()-1);

        if (sletters.equals(pletters)) indexes.add(0);

        int left = 1;
        int right = p.length();

        while (right < s.length()) {
            if (sletters.get(s.charAt(left-1)).equals(1)) {
                sletters.remove(s.charAt(left-1));
            } else {
                sletters.compute(s.charAt(left-1), (k,v) -> v-1);
            }

            sletters.computeIfPresent(s.charAt(right), (k,v) -> v+1);
            sletters.putIfAbsent(s.charAt(right), 1);

            if (sletters.equals(pletters)) indexes.add(left);

            left += 1;
            right += 1;
        }

        return indexes;
    }

    public HashMap<Character, Integer> returnMap( String str, int left, int right) {
        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = left; i <= right; i++) {
            letters.computeIfPresent(str.charAt(i), (k,v) -> v+1);
            letters.putIfAbsent(str.charAt(i), 1);
        }

        return letters;
    }

}