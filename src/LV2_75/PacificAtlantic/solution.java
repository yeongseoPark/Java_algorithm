package LV2_75.PacificAtlantic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList();
        int m = heights.length, n = heights[0].length;
        boolean[][] visitedPacific = new boolean[m][n];
        boolean[][] visitedAtlantic = new boolean[m][n];

        /* ocean 에서 island로 향하는 dfs 실시 */
        for (int i = 0; i < m; i++) {
            dfs(i, 0, heights, visitedPacific);
            dfs(i, n - 1, heights, visitedAtlantic);
        }
        for (int j = 0; j < n; j++) {
            dfs(0, j, heights, visitedPacific);
            dfs(m - 1, j, heights, visitedAtlantic);
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visitedPacific[i][j] && visitedAtlantic[i][j]) {// 두 ocean 다 방문시
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    public static void dfs(int i, int j, int[][] heights, boolean[][] visited) {
        int m = heights.length, n = heights[0].length;
        visited[i][j] = true;
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for (int[] dir : dirs) {
            int x = i + dir[0], y = j + dir[1];
            if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y] && heights[x][y] >= heights[i][j]) {
                dfs(x, y, heights, visited);
            }
        }
    }
}
