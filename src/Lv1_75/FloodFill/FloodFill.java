package Lv1_75.FloodFill;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] visited = new int[image.length][image[0].length];
        int current = image[sr][sc];


        recur(image, sr,sc, color, visited, current);

        return image;
    }

    public void recur(int[][] image, int sr, int sc, int color, int[][] visited, int current) {
        visited[sr][sc] = 1;
        image[sr][sc] = color;
        List<List<Integer>> direction
                = Arrays.asList(Arrays.asList(1,0), Arrays.asList(-1,0), Arrays.asList(0,1), Arrays.asList(0,-1));

        for (int i = 0; i < 4; i++) {
            if (sr+direction.get(i).get(0) >= 0 && sr+direction.get(i).get(0) < visited.length
                    && sc+direction.get(i).get(1) >= 0 &&  sc+direction.get(i).get(1) < visited[0].length
                    && visited[sr+direction.get(i).get(0)][ sc+direction.get(i).get(1)] != 1) {

                if (image[sr+direction.get(i).get(0)][sc+direction.get(i).get(1)] == current) {
                    recur(image, sr+direction.get(i).get(0), sc+direction.get(i).get(1), color, visited, current);
                }
            }
        }
    }
}

//    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//        int color = image[sr][sc];
//        if (color != newColor) dfs(image, sr, sc, color, newColor);
//        return image;
//    }
//    public void dfs(int[][] image, int r, int c, int color, int newColor) {
//        if (image[r][c] == color) {
//            image[r][c] = newColor;
//            if (r >= 1) dfs(image, r-1, c, color, newColor);
//            if (c >= 1) dfs(image, r, c-1, color, newColor);
//            if (r+1 < image.length) dfs(image, r+1, c, color, newColor);
//            if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);
//        }
//    }