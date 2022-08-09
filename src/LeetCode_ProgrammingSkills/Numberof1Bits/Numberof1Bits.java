//https://leetcode.com/problems/number-of-1-bits/

package LeetCode_ProgrammingSkills.Numberof1Bits;

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String unsigned = Integer.toBinaryString(n);

        int result = 0;


        for (char s:unsigned.toCharArray()) {
            if (s == '1') result++;
        }

        return result;
    }
}

class Solution2 { // 비트연산 사용한 더 좋은 방법
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        while (n!=0) {
            ones = ones + (n&1);
            // 1은 32비트로 00000000000000000000000000000001
            // &는 대응되는 두 비트가 모두 1일때만 1을 반환한다. 따라서 2~32번째는 상관없이(0이니까), n의 마지막 비트가 1이면 1반환
            n = n >>> 1;
            // 다음 비트를 확인하기 위하여 n을 오른쪽으로 한번 쉬프트
            // >>를 쓰게되면, 맨 왼쪽은 최상위 비트에 해당하는 수를 넣기에, 음수의 경우 while문이 끝나지 않는다
            // 그래서 빈공간을 무조건 0으로 채우는 >>>를 사용
        }

        return ones;
    }
}
