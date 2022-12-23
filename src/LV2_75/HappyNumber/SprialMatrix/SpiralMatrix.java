package LV2_75.HappyNumber.SprialMatrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int colEnd = matrix[0].length - 1;
        int rowEnd = matrix.length - 1;

        int rowStart = 0, colStart = 0;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 우측
            for (int i = colStart; i<= colEnd; i++) {
                ans.add(matrix[rowStart][i]);
            }
            rowStart++;

            // 아래
            for (int i = rowStart ; i<= rowEnd; i++) {
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            // 왼쪽
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    ans.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            // 위쪽
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    ans.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return ans;
    }
}
