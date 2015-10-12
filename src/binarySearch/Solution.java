package binarySearch;

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        long from = 0;
        long to = nums.length - 1;

        while (from <= to) {
            if (check(nums, from, target)) {
                return (int)from;
            }

            if (check(nums, to, target)) {
                return (int)to;
            }

            if (to - from <= 1) {
                return -1;
            }

            long i = (from + to) / 2;

            if (nums[(int)i] < target) {
                from = i;
            } else {
                to = i;
            }
        }
        return -1;
    }

    public boolean check(int[] nums, long index, int target) {
        if (index == 0) {
            return nums[(int)index] == target;
        }
        return nums[(int)index - 1] < target && nums[(int)index] == target;
    }
}
