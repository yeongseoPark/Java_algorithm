package LeetCode_ProgrammingSkills.FindtheNearestPointThathasSameXorY;

import java.util.*;

class Solution {
    public static int nearestValidPoint(int x, int y, int[][] points) {
        // 1. 전체 iter해서 Manhattan : [[x,y] , idx], 인 Map
        // 2. Map 없으면 -1 리턴
        // 3. Map을 1.키값 , 2. points배열 인덱스 순으로 정렬
        TreeMap<Integer, ArrayList> map = new TreeMap<>();

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int dist = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
                if (!map.containsKey(dist)) { // 없으면
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    arr.add(i);
                    map.put(dist, arr);
                } else {
                    map.get(dist).add(i);
                }
            }
        }
        if (map.isEmpty()) return -1;

        System.out.println("map = " + map);

        int tmp = (int)map.pollFirstEntry().getValue().get(0);
        System.out.println("tmp = " + tmp );

        return tmp;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        System.out.println(nearestValidPoint(3, 4, arr));
    }
}