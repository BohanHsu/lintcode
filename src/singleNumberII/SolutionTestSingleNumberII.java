package singleNumberII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/21/16.
 */
public class SolutionTestSingleNumberII {
    @Test
    public void testSingleNumberII() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,2,3,3,3,2,2,4,1};
        int expectedResult = 4;
        assertEquals(expectedResult, solution.singleNumberII(nums));
    }

}