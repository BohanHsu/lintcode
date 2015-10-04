package _2sum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/4/15.
 */
public class SolutionTest2Sum {
    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = null;
        int[] expectedResult = new int[]{1,2};

        result = solution.twoSum(nums, target);

        assertEquals(expectedResult.length, result.length);

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }

        nums = new int[]{4,4,2,7,11,15};
        target = 8;
        expectedResult = new int[]{1,2};

        result = solution.twoSum(nums, target);

        assertEquals(expectedResult.length, result.length);

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }

        nums = new int[]{4,6,2,7,11,15};
        target = 8;
        expectedResult = new int[]{2,3};

        result = solution.twoSum(nums, target);

        assertEquals(expectedResult.length, result.length);

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }

    }

}