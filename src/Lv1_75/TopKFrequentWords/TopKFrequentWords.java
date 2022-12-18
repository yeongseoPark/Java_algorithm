package Lv1_75.TopKFrequentWords;

import java.util.*;

class Solution {
    private static class CustomComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b) {
            int compare1 =  b.getValue() - a.getValue();

            if (compare1 != 0) {
                return compare1;
            } else {
                return (a.getKey()).compareTo(b.getKey());
            }
        }
    }

    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.computeIfPresent(word, (key, val) -> val + 1);
            freq.putIfAbsent(word, 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
        Collections.sort(entries, new CustomComparator());

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(entries.get(i).getKey());
        }

        return ans;
    }
}


