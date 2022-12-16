package Lv1_75.DecodeString;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        final String string = decodeString("3[ab2[c]]");
        System.out.println(string);
    }
    
    
    // 1. loop through s
    // 2. number / [ / letter / ] : 네가지 가능성
    // 3. Two stack : 1. count 2. string : 같은 길이

    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack();
        Stack<String> results = new Stack();
        String res = "";
        int index = 0;

        while (index < s.length()) {
            /* traverse */

            if (Character.isDigit(s.charAt(index))) { // 1. 숫자
                int count = 0;
                while (Character.isDigit(s.charAt(index))) { // 33333 같은경우
                    count = 10 * count + (s.charAt(index) - '0');
                    index += 1;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') { // [
                results.push(res);
                res = "";
                index += 1;
            } else if (s.charAt(index) == ']') { // ]
                StringBuilder temp = new StringBuilder(results.pop());
                int count = counts.pop();
                for (int i = 0; i < count ; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index += 1;
            } else { // character
                res += s.charAt(index);
                index += 1;
            }

        }

        return res;
    }
}