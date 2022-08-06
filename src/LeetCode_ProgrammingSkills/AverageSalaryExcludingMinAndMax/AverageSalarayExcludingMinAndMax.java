package LeetCode_ProgrammingSkills.AverageSalaryExcludingMinAndMax;

import java.util.Arrays;

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int result[] = Arrays.copyOfRange(salary,1 , salary.length-1);
        // copyOfRange(original, from, to)

        double average = Arrays.stream(result).average().orElse(0);

        return average;
    }
}

class Solution2 { // O(n)
    public double average(int[] salary) {
        double sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n = salary.length;

        for (int num: salary) {
            sum += num;
            min =  Math.min(min, num);
            max =  Math.max(max, num);
        }
        return (sum-min-max)/ (n-2);
    }
}