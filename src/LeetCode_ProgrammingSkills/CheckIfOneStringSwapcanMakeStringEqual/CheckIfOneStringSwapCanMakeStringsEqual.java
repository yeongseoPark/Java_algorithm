package LeetCode_ProgrammingSkills.CheckIfOneStringSwapcanMakeStringEqual;

import java.util.*;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int dif = 0;

        for (int i=0; i < str1.length; i++) {
            /* 두군데 이상 다르면 false */
            if (str1[i] != str2[i]) {
                dif++;
                if (dif > 2) return false;
            }

            /* 딕셔너리를 통해 요소파악 */
            int x = 1;

            if (map.containsKey(str1[i])) {
                x = map.get(str1[i]) +1;
            }
            map.put(str1[i], x);

            int y = -1;
            if (map.containsKey(str2[i])) {
                y = map.get(str2[i]) - 1;
            }

            map.put(str2[i], y);
        }

        Collection<Integer> values = map.values();
        for (int i: values) {
            if (i != 0) { return false; }
        }

        return true;

    }
}

class Solution2 { // 리스트를 통한 비교, 더 빠른방법
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                l.add(i);
            if (l.size() > 2) return false; // 다른곳이 두군데(즉 하나의 문자가 뒤바뀜) 이상이면 false
        }

        return l.size() == 0 || (l.size() == 2
                && s1.charAt(l.get(0)) == s2.charAt(l.get(1))
                && s1.charAt(l.get(1)) == s2.charAt(l.get(0)));
        // 다른 곳이 없거나
        // 다른 곳이 두군데이면서, 인덱스를 바꾸면 서로 들어맞는다면 true
    }
}