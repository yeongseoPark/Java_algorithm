package LeetCode_ProgrammingSkills.CheckIfitIsaStraightLine;

class Solution {
    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates[0][0] == coordinates[1][0]) { // 기울기 무한대
            for (int i =2 ; i < coordinates.length ; i++) {
                if (coordinates[i][0] != coordinates[0][0]) {
                    System.out.println(coordinates[i][0]);
                    return false;
                }

            }
            return true;
        }

        double slope = (coordinates[1][1] - coordinates[0][1]) / (double) (coordinates[1][0]- coordinates[0][0]);
        /* 기울기가 n.xx일 경우, 계산과정에서 double로 변환해주지 않으면 소수점 자리를 버리고 n이 기울기가 되기에 double을 계산과정에 넣어서 값 손실 없애야함 */

        double b     = (coordinates[0][1] - slope * coordinates[0][0]);


        for (int i =2 ; i < coordinates.length ; i++) {
            if (slope * coordinates[i][0] + b != coordinates[i][1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] ss = {{2,1},{4,2},{6,3}};
        System.out.println(checkStraightLine(ss));

    }
}