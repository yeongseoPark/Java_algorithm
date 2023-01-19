package LV2_75.SearchInRotatedSortedArray;

class Solution {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0) return -1;


        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2; // nums가 길지 않아 이렇게 해주지 않아도 사실 괜찮다

            int last_index = nums.length - 1;

            if ((nums[mid] - nums[last_index]) * (target - nums[last_index]) > 0)
            // target과 nums[mid]가 같은 편(피봇 이후 같은 사이드) 에 있다면
            {

                if(nums[mid] < target)
                    low = mid + 1;
                else
                    high = mid;

            } else if (target > nums[last_index]) { // target이 피봇의 왼쪽 사이드라면(더 큰 쪽)
                high = mid;
            } else { // target이 피봇의 오른쪽 사이드라면
                low = mid + 1;
            }
        }

        // high = low 가 됨
        if (nums[low] == target) {
            return low;
        }

        return - 1;

    }
}