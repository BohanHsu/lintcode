package firstMissingPositive;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/4/15.
 */
public class SolutionTestFirstMissingPositive {

    @Test
    public void testFirstMissingPositive() {
        Solution solution = new Solution();
        int[] nums = null;
        int expectedResult = 0;
        int result = 0;

        nums = new int[]{1,2,0};
        expectedResult = 3;

        result = solution.firstMissingPositive(nums);
        assertEquals(expectedResult, result);

        nums = new int[]{3,4,-1,1};
        expectedResult = 2;

        result = solution.firstMissingPositive(nums);
        assertEquals(expectedResult, result);

        nums = new int[]{1,2,3,4};
        expectedResult = 5;

        result = solution.firstMissingPositive(nums);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testOnlineFailed() {
        Solution solution = new Solution();
        int[] nums = null;
        int expectedResult = 0;
        int result = 0;

        nums = new int[]{1,1};
        expectedResult = 2;

        result = solution.firstMissingPositive(nums);
        assertEquals(expectedResult, result);
    }

}