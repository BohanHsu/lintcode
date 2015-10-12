package searchForARange;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestSearchForARange {
    @Test
    public void testSearchRange() {
        Solution solution = new Solution();
        int[] nums = null;
        int target = 0;
        int[] result = null;
        int[] expectedResultArr = null;

        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 8;
        result = solution.searchRange(nums, target);
        expectedResultArr = expectedResult(nums, target);
        assertEquals(expectedResultArr[0], result[0]);
        assertEquals(expectedResultArr[1], result[1]);

        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 9;
        result = solution.searchRange(nums, target);
        expectedResultArr = expectedResult(nums, target);
        assertEquals(expectedResultArr[0], result[0]);
        assertEquals(expectedResultArr[1], result[1]);

        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 0;
        result = solution.searchRange(nums, target);
        expectedResultArr = expectedResult(nums, target);
        assertEquals(expectedResultArr[0], result[0]);
        assertEquals(expectedResultArr[1], result[1]);

        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 19;
        result = solution.searchRange(nums, target);
        expectedResultArr = expectedResult(nums, target);
        assertEquals(expectedResultArr[0], result[0]);
        assertEquals(expectedResultArr[1], result[1]);
    }

    public int[] expectedResult(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] == target) {
                    start = i;
                }
            } else {
                if (nums[i-1] != target && nums[i] == target) {
                    start = i;
                }
            }

            if (i == nums.length - 1) {
                if (nums[i] == target) {
                    end = i;
                }
            } else {
                if (nums[i] == target && nums[i+1] != target) {
                    end = i;
                }
            }
        }
        return new int[]{start, end};
    }

}