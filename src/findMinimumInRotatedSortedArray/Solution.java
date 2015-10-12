package findMinimumInRotatedSortedArray;

public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here

        int from = 0, to = num.length - 1;

        while (from <= to) {
            if (checkMinimum(num, from)) {
                return num[from];
            }

            if (checkMinimum(num, to)) {
                return num[to];
            }

            if (to - from <= 1) {
                return num[from] < num[to] ? num[from] : num[to];
            }

            int i = (from + to) / 2;

            if (num[from] > num[i]) {
                to = i;
            } else if (num[i] > num[to]) {
                from = i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public boolean checkMinimum(int[] nums, int i) {
        if (i == 0) {
            return nums[i] < nums[nums.length-1];
        }

        return nums[i] < nums[i-1];
    }
}
