package findPeakElement;

class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int[] nums = A;

        int from = 0, to = nums.length - 1;
        int i = (from + to) / 2;

        if (nums[i] < nums[from]) {
            to = i;
        } else if (nums[i] < nums[to]) {
            from = i;
        } else {
            if (checkPeak(nums, i)) {
                return i;
            } else if (nums[i] < nums[i-1]) {
                to = i;
            } else if (nums[i] < nums[i + 1]) {
                from = i;
            }
        }

        while (from <= to) {
            if (checkPeak(nums, from)) {
                return from;
            }

            if (checkPeak(nums, to)) {
                return to;
            }

            if (to - from <= 1) {
                return -1;
            }

            i = (from + to) / 2;
            if (checkPeak(nums, i)) {
                return i;
            } else if (nums[i] < nums[i-1]) {
                to = i;
            } else if (nums[i] < nums[i+1]) {
                from = i;
            }
        }
        return -1;
    }

    public boolean checkPeak(int[] nums, int i) {
        if (i <= 0 || i >= nums.length - 1) {
            return false;
        }
        return nums[i] > nums[i-1] && nums[i] > nums[i+1];
    }
}
