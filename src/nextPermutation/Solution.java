package nextPermutation;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by bohan on 2/19/16.
 */
public class Solution {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public int[] nextPermutation(int[] nums) {
        // write your code here
        int i = nums.length - 1;
        while (i > 0) {
            if (nums[i] <= nums[i-1]) {
                i--;
            } else {
                break;
            }
        }

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        int lowerBoundry  = Integer.MIN_VALUE;
        if (i != 0) {
            lowerBoundry = nums[i-1];
        }
        for (int j = i; j < nums.length; j++) {
            if (nums[j] < min && nums[j] > lowerBoundry) {
                min = nums[j];
                minIndex = j;
            }
        }

        if (i == 0) {
            i = 1;
        }

        for (int j = minIndex; j >= i && j >= 1; j--) {
            nums[j] = nums[j-1];
        }

        nums[i-1] = min;

        quicksort(nums, i, nums.length - 1);

        return nums;
    }

    public void quicksort(int[] nums, int from, int to) {
        if (from >= to) {
            return;
        }

        if (from == to - 1) {
            if (nums[from] <= nums[to]) {
                return;
            } else {
                swap(nums, from, to);
            }
        }

        Random rand = new Random();
        int pivot = rand.nextInt(to - from + 1) + from;
        swap(nums, pivot, to);

        int j = from - 1;
        int i = from;
        while (i < to) {
            if (nums[i] < nums[to]) {
                swap(nums, i, j + 1);
                j++;
            }
            i++;
        }
        swap(nums, j + 1, to);

        quicksort(nums, from, j);
        quicksort(nums, j + 2, to);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
