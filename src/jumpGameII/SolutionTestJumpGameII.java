package jumpGameII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/20/16.
 */
public class SolutionTestJumpGameII {
    @Test
    public void testJump() {
        Solution solution = new Solution();
        int[] a = new int[]{2,3,1,1,4};
        int expectedResult = 2;
        assertEquals(expectedResult, solution.jump(a));

        a = new int[]{2,2,1,1,4};
        expectedResult = 3;
        assertEquals(expectedResult, solution.jump(a));
    }

}