package sqrt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/8/15.
 */
public class SolutionTestSqrt {
    @Test
    public void testSqrt() {
        Solution solution = new Solution();
        int x = 0;
        int result = 0;
        int expectedResult = 0;

        x = 0;
        result = solution.sqrt(x);
        expectedResult = 0;
        assertEquals(expectedResult, result);

        x = 1;
        result = solution.sqrt(x);
        expectedResult = 1;
        assertEquals(expectedResult, result);

        x = 3;
        result = solution.sqrt(x);
        expectedResult = 1;
        assertEquals(expectedResult, result);

        x = 4;
        result = solution.sqrt(x);
        expectedResult = 2;
        assertEquals(expectedResult, result);

        x = 5;
        result = solution.sqrt(x);
        expectedResult = 2;
        assertEquals(expectedResult, result);

        x = 10;
        result = solution.sqrt(x);
        expectedResult = 3;
        assertEquals(expectedResult, result);

        for (int i = 0; i < 10000; i++) {
            assertEquals((int) Math.sqrt(i), solution.sqrt(i));
        }
    }

    @Test
    public void testOnlineFailed() {
        Solution solution = new Solution();
        int x = 0;
        int result = 0;
        int expectedResult = 0;

        x = 999999999;
        result = solution.sqrt(x);
        expectedResult = (int)Math.sqrt(x);
        assertEquals(expectedResult, result);
    }

}