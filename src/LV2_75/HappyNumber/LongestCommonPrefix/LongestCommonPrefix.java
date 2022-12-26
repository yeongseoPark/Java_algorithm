package LV2_75.HappyNumber.LongestCommonPrefix;

import java.util.Arrays;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (a, b)->Integer.compare(a.length(), b.length()));
        int length = strs[0].length();

        char[] longest = strs[0].toCharArray();
        int cut = length;

        for (String str : strs) {
            for (int i = 0; i < length; i++) {
                if (str.toCharArray()[i] != longest[i]) {
                    cut = Math.min(i,cut);
                }
            }
        }

        if (cut == 0) return "";

        char[] chars = Arrays.copyOfRange(longest, 0, cut);
        return String.valueOf(chars);

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}

/* 사전순 정렬하여 맨 앞과 뒤 비교 */
//if (strs == null || strs.length == 0)
//        return "";
//
//        Arrays.sort(strs);
//        System.out.println(Arrays.toString(strs));
//        String first = strs[0];
//        String last = strs[strs.length - 1];
//        int c = 0;
//        while(c < first.length())
//        {
//        if (first.charAt(c) == last.charAt(c))
//        c++;
//        else
//        break;
//        }
//        return c == 0 ? "" : first.substring(0, c);