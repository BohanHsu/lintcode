package o1CheckPowerOf2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/14/15.
 */
public class SolutionTestO1CheckPowerOf2 {
    @Test
    public void testCheckPowerOf2() {
        Solution solution = new Solution();
        int n = 0;
        boolean expectedResult = false;
        assertEquals(expectedResult, solution.checkPowerOf2(n));

        n = 1;
        expectedResult = true;
        assertEquals(expectedResult, solution.checkPowerOf2(n));

        n = 2;
        expectedResult = true;
        assertEquals(expectedResult, solution.checkPowerOf2(n));

        n = 256;
        expectedResult = true;
        assertEquals(expectedResult, solution.checkPowerOf2(n));
    }

}