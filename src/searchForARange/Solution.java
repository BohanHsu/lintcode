package searchForARange;

public class Solution {
    /**
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int[] nums = A;
        int from = 0, to = nums.length - 1;

        int start = 0, end = 0;

        while (from <= to) {
            if (check1(nums, from, target)) {
                start = from;
                break;
            }
            if (check1(nums, to, target)) {
                start = to;
                break;
            }
            if (to - from <= 1) {
                return new int[]{-1, -1};
            }

            int i = (from + to) / 2;

            if (nums[i] < target) {
                from = i;
            } else {
                to = i;
            }
        }

        from = start;
        to = nums.length - 1;

        while (from <= to) {
            if (check2(nums, from, target)) {
                return new int[]{start, from};
            }
            if (check2(nums, to, target)) {
                return new int[]{start, to};
            }
            if (to - from <= 1) {
                return new int[]{-1, -1};
            }
            int i = (from + to) / 2;

            if (nums[i] > target) {
                to = i;
            } else {
                from = i;
            }
        }
        return new int[]{-1, -1};
    }

    public boolean check1(int[] nums, int index, int target) {
        if (index == 0) {
            return nums[index] == target;
        }

        return nums[index] == target && nums[index-1] < target;
    }

    public boolean check2(int[] nums, int index, int target) {

        if (index == nums.length - 1) {
            return nums[index] == target;
        }

        return nums[index] == target && nums[index+1] > target;
    }
}
