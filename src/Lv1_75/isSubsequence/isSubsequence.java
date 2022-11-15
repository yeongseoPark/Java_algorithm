package Lv1_75.isSubsequence;

class Solution {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i += 1;

            j += 1;
        }

        return (i == s.length());
    }

    public static void main(String[] args) {
        final boolean subsequence = isSubsequence("axc", "ahbgdc");
        System.out.println(subsequence);
    }
}

