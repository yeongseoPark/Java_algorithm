package Lv1_75.IsomorphicStrings;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mappingDictStoT = new int[256]; // 아스키코드 256개
        Arrays.fill(mappingDictStoT, -1);

        int[] mappingDictTtos = new int[256]; // 아스키코드 256개
        Arrays.fill(mappingDictTtos, -1);

        /* One-to-One 매핑을 위한 두개의 딕셔너리 */

        for (int i =0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mappingDictStoT[c1] == -1 && mappingDictTtos[c2] == -1) {
                mappingDictStoT[c1] = c2;
                mappingDictTtos[c2] = c1;
            } else if (!(mappingDictStoT[c1] == c2 && mappingDictTtos[c2] == c1)) {
                return false;
            }
        }
        return  true;
    }
}