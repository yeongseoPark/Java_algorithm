package Lv1_75.LastStoneWeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            minHeap.add(stone);
        }

        while (minHeap.size() > 1) {
            int big = minHeap.poll();
            int second = minHeap.poll();

            if (big == second) {
                continue;
            } else {
                minHeap.add(big - second);
            }
        }

        return (minHeap.isEmpty()) ? 0 :minHeap.poll();
    }
}
