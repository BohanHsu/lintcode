package searchInsertPosition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestSearchInsertPosition {
    @Test
    public void testSearchInsert() {
        Solution solution = new Solution();
        int[] nums = null;
        int target = 0;
        int result = 0;
        int expectedResult = 0;

        nums = new int[]{1,3,5,6};
        target = 5;
        expectedResult = 2;
        assertEquals(expectedResult, solution.searchInsert(nums, target));

        target = 2;
        expectedResult = 1;
        assertEquals(expectedResult, solution.searchInsert(nums, target));

        target = 7;
        expectedResult = 4;
        assertEquals(expectedResult, solution.searchInsert(nums, target));

        target = 0;
        expectedResult = 0;
        assertEquals(expectedResult, solution.searchInsert(nums, target));

        target = 9;
        nums = new int[]{};
        expectedResult = 0;
        assertEquals(expectedResult, solution.searchInsert(nums, target));

        target = 5;
        nums = new int[]{5};
        expectedResult = 0;
        assertEquals(expectedResult, solution.searchInsert(nums, target));
    }

}