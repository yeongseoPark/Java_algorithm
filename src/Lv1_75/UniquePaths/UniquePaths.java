package Lv1_75.UniquePaths;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid= new int[m][n];
        for (int i = 0; i < n ; i++) {
            grid[0][i] = 1;
        }
        for (int i = 0; i < m ; i++) {
            grid[i][0] = 1;
        }

        for (int j = 1; j <m ; j++) {
            for (int i = 1; i < n ; i++) {
                grid[j][i] = grid[j-1][i] + grid[j][i-1];
            }
        }

        return grid[m-1][n-1];
    }
}