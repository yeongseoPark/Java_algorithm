package LV2_75.HappyNumber.MultiplyStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        /* num1 과 num2, 각 자릿수의 곱(뒤->앞)을 product에 기록 */
        /* 두 수의 곱은 두숫자의 길이의 합을 넘지 못함. 따라서 n1+n2 */
        /* 맨 앞칸은 올림수의 가능성을 두고 비워둠 */
        int n1 = num1.length(), n2 = num2.length();
        int[] products = new int[n1 + n2];
        for (int i = n1 -1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                products[i+j+1] += d1 * d2;
            }
        }

        /* product배열의 값을 sum으로 만들기 위한 더하기(올림)과정 */
        int carry = 0; // 올림수
        for (int i = products.length - 1; i >= 0; i--) {
            int tmp = (products[i] +carry) % 10;
            carry = (products[i] + carry) / 10;
            products[i] = tmp;
        }

        /* 맨 앞의 0을 빼기 */
        StringBuilder sb = new StringBuilder();
        for (int num : products) sb.append(num);
        while ( sb. length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        MultiplyStrings m = new MultiplyStrings();
        System.out.println(m.multiply("99","99"));
    }
}
