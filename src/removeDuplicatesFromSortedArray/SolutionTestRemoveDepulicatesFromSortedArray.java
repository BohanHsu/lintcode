package removeDuplicatesFromSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/3/15.
 */
public class SolutionTestRemoveDepulicatesFromSortedArray {
    int[] nums = null;

    @Test
    public void testRemoveDuplicates() {
        Solution solution = new Solution();
        int[] expectedArr = null;
        int expectedResult;

        nums = new int[]{1,2,2,3,3,3,4,5,5};
        expectedResult = 5;
        expectedArr = new int[]{1,2,3,4,5};

        int result = solution.removeDuplicates(nums);
        assertEquals(expectedResult, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], nums[i]);
        }

        nums = new int[]{1,2,3,4,5};
        expectedResult = 5;
        expectedArr = new int[]{1,2,3,4,5};

        result = solution.removeDuplicates(nums);
        assertEquals(expectedResult, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], nums[i]);
        }

        nums = new int[]{1,2};
        expectedResult = 2;
        expectedArr = new int[]{1,2};

        result = solution.removeDuplicates(nums);
        assertEquals(expectedResult, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], nums[i]);
        }

        nums = new int[]{1,1};
        expectedResult = 1;
        expectedArr = new int[]{1};

        result = solution.removeDuplicates(nums);
        assertEquals(expectedResult, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], nums[i]);
        }
    }

    @Test
    public void testOnlineFailed() {
        Solution solution = new Solution();
        int[] expectedArr = null;
        int expectedResult;

        nums = new int[]{};
        expectedResult = 0;
        expectedArr = new int[]{};

        int result = solution.removeDuplicates(nums);
        assertEquals(expectedResult, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], nums[i]);
        }
    }
}