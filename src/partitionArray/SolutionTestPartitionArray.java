package partitionArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestPartitionArray {
    @Test
    public void testPartitionArray() {
        Solution solution = new Solution();
        int[] nums = null;
        int k = 0;
        int expectedResult = 0;
        int result = 0;

        nums = new int[]{3, 2, 2, 1};
        k = 2;
        expectedResult = 1;
        result = solution.partitionArray(nums, k);

        assertEquals(expectedResult, result);
        assertTrue(checkArray(nums, k));

        nums = new int[]{3, 2, 2, 1};
        k = 6;
        expectedResult = 4;
        result = solution.partitionArray(nums, k);

        assertEquals(expectedResult, result);
        assertTrue(checkArray(nums, k));

        nums = new int[]{3, 2, 2, 1};
        k = 0;
        expectedResult = 0;
        result = solution.partitionArray(nums, k);

        assertEquals(expectedResult, result);
        assertTrue(checkArray(nums, k));
    }

    public boolean checkArray(int[] nums, int k) {
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                if (nums[i] < k) {
                    return false;
                }
            } else {
                if (nums[i] >= k) {
                    flag = true;
                }
            }
        }
        return true;
    }
}