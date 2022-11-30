package FirstBadVersion;



public class Solution{
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int checked;

        while (left < right) {
            checked = left + (right -left)/ 2;

            if (isBadVersion(checked) == true) {
                right = checked;
            } else {
                left = checked+1 ;
            }
        }

        return left;
    }

    public boolean isBadVersion(int checked) {
        return true; // 그냥둔것
    }
}