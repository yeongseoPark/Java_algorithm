package Lv1_75.LongestRepeatingCharacterReplacement;

class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int[] frequencyMap = new int[26];
        int maxFrequency = 0;
        int longestSubstringLength = 0;

        for (int end = 0; end < s.length(); end += 1) {
            int currentChar = s.charAt(end) - 'A';
            frequencyMap[currentChar] += 1;

            // 현재까지 모든 윈도우에서 본 최고 빈도 -> 창마다 변하는 것 x
            maxFrequency = Math.max(maxFrequency, frequencyMap[currentChar]);


            /* window 크기 - 최대 빈도 <= k) : maxFreq가 창크기가 줄지 않게 함 */
            Boolean isValid = (end + 1 - start - maxFrequency <= k);
            if (!isValid) {
                // 윈도우에서 나감
                int outgoingChar = s.charAt(start) - 'A';

                // decrease its frequency
                frequencyMap[outgoingChar] -= 1;
                start += 1;
            }

            // the window is valid at this point, note down the length
            // size of the window never decreases
            longestSubstringLength = end + 1 - start;
        }

        return longestSubstringLength;
    }
}
