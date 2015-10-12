package searchInsertPosition;

public class Solution {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        int[] nums = A;
        int from = 0, to = nums.length - 1;

        if (nums.length == 0) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        while (from <= to) {
            if (checkPositoin(nums, from, target)) {
                return from;
            }

            if (checkPositoin(nums, to, target)) {
                return to;
            }

            int i = (from + to) / 2;

            if (checkPositoin(nums, i, target));

            if (nums[i] < target) {
                from = i;
            } else {
                to = i;
            }
        }
        return -1;
    }

    public boolean checkPositoin(int[] nums, int index, int target) {
        if (index == 0) {
            return nums[index] >= target;
        }

        return nums[index - 1] < target && nums[index] >= target;
    }
}
