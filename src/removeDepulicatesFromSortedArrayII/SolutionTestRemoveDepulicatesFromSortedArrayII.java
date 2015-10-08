package removeDepulicatesFromSortedArrayII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/8/15.
 */
public class SolutionTestRemoveDepulicatesFromSortedArrayII {
    int[] nums = null;
    @Test
    public void testRemoveDuplicates() {
        Solution solution = new Solution();
        int[] expectedArr = null;
        int expectedResult = 0;
        int result = 0;

        nums = new int[]{1,1,1,2,2,3};
        expectedArr = new int[]{1,1,2,2,3};
        expectedResult = 5;

        result = solution.removeDuplicates(nums);

        assertEquals(expectedResult, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], nums[i]);
        }

        nums = new int[]{};
        expectedArr = new int[]{};
        expectedResult = 0;

        result = solution.removeDuplicates(nums);

        assertEquals(expectedResult, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], nums[i]);
        }

    }
}