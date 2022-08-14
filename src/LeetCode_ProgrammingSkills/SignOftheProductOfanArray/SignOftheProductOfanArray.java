//https://leetcode.com/problems/sign-of-the-product-of-an-array/
package LeetCode_ProgrammingSkills.SignOftheProductOfanArray;

class Solution {
    public static int arraySign(int[] nums) {
        double sum = 1; // 크기를 고려하여 double을 사용(값이 변형되지 않도록)
        for (int i:nums) {
            sum *= i;
        }
        System.out.println(sum);
        if (sum > 0) {return 1;}
        else if (sum < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};

        System.out.println(arraySign(nums));
    }
}