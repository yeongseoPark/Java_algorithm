package LeetCode_ProgrammingSkills.SubtracttheProductSumofDigits;

class Solution {
    public int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int pro = 1;
        int sum = 0;
        for (char ch: s.toCharArray()) {
            pro *= ch - '0';
            sum += ch - '0';
        }

        return pro-sum;
    }
}