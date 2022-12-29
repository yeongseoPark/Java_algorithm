package LV2_75.whereWilltheBallFall;

class Solution {
    public static int[] findBall(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            ans[i] = dfs(grid, 0, i);
        }

        return ans;
    }

    public static int dfs(int[][] grid, int row,int col) {
        int left = 0;
        int right = grid[0].length-1;

        if (row == grid.length) {
            return col;
        }

        if (grid[row][col] == 1) { // 오른쪽 대각선
            if (col + 1 > right || grid[row][col+1] == -1) {
                return -1;
            } else {
                return dfs(grid, row + 1, col + 1);
            }
        } else { // 왼쪽 대각선
            if (col - 1 < left || grid[row][col-1] == 1) {
                return -1;
            } else {
                return dfs(grid, row + 1, col - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1}, {-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        findBall(grid);
    }
}