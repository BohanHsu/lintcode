package findMinimumInRotatedSortedArrayII;

public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        return findMinHelper(num, 0, num.length-1);
    }

    public int findMinHelper(int[] num, int from, int to) {
        while (from <= to) {
            if (checkMinimum(num, from)) {
                return num[from];
            }
            if (checkMinimum(num, to)) {
                return num[to];
            }
            if (to - from <= 1) {
                return Math.min(num[from], num[to]);
            }

            int i = (from + to) / 2;

            if (num[i] > num[to]) {
                from = i;
            } else if (num[from] > num[i]) {
                to = i;
            } else {
                return Math.min(findMinHelper(num,from, i), findMinHelper(num, i, to));
            }
        }
        return Integer.MAX_VALUE;
    }

    public boolean checkMinimum(int[] num, int i) {
        if (i == 0) {
            return num[num.length-1] > num[i];
        }

        return num[i-1] > num[i];
    }
}

