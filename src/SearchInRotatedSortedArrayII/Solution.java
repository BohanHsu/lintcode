package SearchInRotatedSortedArrayII;

public class Solution {
    /**
     * param A : an integer ratated sorted array and duplicates are allowed
     * param target :  an integer to be search
     * return : a boolean
     */
    public boolean search(int[] A, int target) {
        // write your code here
        return search(A, 0, A.length-1, target);
    }

    public boolean search(int[] nums, int from, int to, int target) {
        while (from <= to) {
            if (nums[from] == target) {
                return true;
            }
            if (nums[to] == target) {
                return true;
            }
            if (to - from <= 1) {
                return nums[from] == target || nums[to] == target;
            }
            int i = (from + to) / 2;
            if (nums[from] < nums[i] && (nums[from] > target || nums[i] < target)) {
                from = i;
            } else if (nums[i] < nums[to] && (nums[i] > target || nums[to] < target)) {
                to = i;
            } else {
                return search(nums, from, i, target) || search(nums, i, to, target);
            }
        }
        return false;
    }
}
