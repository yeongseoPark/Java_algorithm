package LV2_75.Searcha2DMatrix;

class Solution {
    // 2차원 배열을 1차원 배열으로 flattening 했다고 생각하고 풀면 됨
    // ex) r=3, c=4 이면 0~11인덱스 갖는 1차원 배열
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        int left = 0;
        int right = r*c -1;

        while (left <= right) {
            int middle = (left + right) /2;
            // left + (right - left) / 2 => 배열의 길이가 매우 긴 경우, left + right의 오버플로우를 막기 위해 이 방식을 사용 가능

            int tmp_row = middle / c;
            int tmp_col = middle % c;

            if (matrix[tmp_row][tmp_col] == target) {
                return true;
            } else if (matrix[tmp_row][tmp_col] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }
}