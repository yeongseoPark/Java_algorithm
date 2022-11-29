package Lv1_75.BinarySearch;

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int middle = nums.length / 2;

        while (left <= right) {
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target ) {
                left = middle + 1;
            } else {
                return middle;
            }
            middle = (right + left) / 2;
        }

        return -1;
    }
}