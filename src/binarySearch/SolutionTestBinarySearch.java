package binarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestBinarySearch {
    @Test
    public void testBinarySearch() {
        Solution solution = new Solution();
        int nums[] = null;
        int target = 0;
        int expectedResult = -1;

        nums = new int[]{1, 2, 3, 3, 4, 5, 10};
        target = 3;
        expectedResult = 2;
        assertEquals(expectedResult, solution.binarySearch(nums, target));

        target = 11;
        expectedResult = -1;
        assertEquals(expectedResult, solution.binarySearch(nums, target));

        target = 0;
        expectedResult = -1;
        assertEquals(expectedResult, solution.binarySearch(nums, target));

        nums = new int[]{};
        target = 0;
        expectedResult = -1;
        assertEquals(expectedResult, solution.binarySearch(nums, target));
    }

}