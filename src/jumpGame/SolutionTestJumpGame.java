package jumpGame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/18/16.
 */
public class SolutionTestJumpGame {
    @Test
    public void testCanJump() {
        Solution solution = new Solution();
        int[] nums = new int[]{2,3,1,1,4};
        boolean expectedResult = true;
        assertEquals(expectedResult, solution.canJump(nums));

        nums = new int[]{3,2,1,0,4};
        expectedResult = false;
        assertEquals(expectedResult, solution.canJump(nums));
    }

}