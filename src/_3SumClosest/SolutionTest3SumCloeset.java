package _3SumClosest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/5/15.
 */
public class SolutionTest3SumCloeset {
    @Test
    public void testThreeSumClosest() {
        Solution solution = new Solution();
        int[] nums = null;
        int target = 0;
        int expectedResult = 0;
        int result = 0;

        nums = new int[]{-1, 2, 1, -4};
        target = 1;
        expectedResult = 2;

        result = solution.threeSumClosest(nums, target);
        assertEquals(expectedResult, result);
    }

}