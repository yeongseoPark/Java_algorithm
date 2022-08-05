package LeetCode_ProgrammingSkills;

import java.util.stream.IntStream;

class Solution {
    public int countOdds(int low, int high) {
        int range = high-low+1;

        if (range % 2 == 0) { // high-low+1 이 짝수면 범위안의 짝수와 홀수 갯수 같다
            return range/2;
        }
        else {  // 범위가 홀수일때

            if (low % 2 == 1) { // 시작과 끝이 홀수면
                return range/2 + 1;
            } else { // 시작과 끝이 짝수이면
                return range /2;
            }
        }
    }
}

// 더 간결한 풀이
class Solutio2 {
    public int countOdds(int low, int high) {
        int range = high-low+1;

        if (low % 2 != 0 && high % 2 != 0) { // 1. 둘다 홀수
            return range/2 +1;
        }
        else { // 2. 둘다 짝수: "짝수"가 range/2+1  3. 홀&짝 하나씩: 짝,홀 모두 range/2 개
            return range /2;
        }
    }
}