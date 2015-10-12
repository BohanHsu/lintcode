package searchInRotatedSortedArray;

public class Solution {
    /**
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        int[] nums = A;

        int from = 0, to = nums.length - 1;

        while (from <= to) {
            if (nums[from] == target) {
                return from;
            }
            if (nums[to] == target) {
                return to;
            }
            if (to - from <= 1) {
                return -1;
            }

            int i = (from + to) / 2;

            if (nums[from] <= target && nums[i] >= target) {
                to = i;
            } else if (nums[i] <= target && nums[to] >= target) {
                from = i;
            } else if (nums[from] > nums[i]){
                to = i;
            } else if (nums[i] > nums[to]) {
                from = i;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
