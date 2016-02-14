package fastPower;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/12/16.
 */
public class SolutionTestFastPower {
    @Test
    public void testFastPower() {
        Solution solution = new Solution();
        int a = 2;
        int b = 3;
        int n = 31;
        int expectedResult = 2;
        assertEquals(expectedResult, solution.fastPower(a, b, n));

        a = 100;
        b = 1000;
        n = 1000;
        expectedResult = 0;
        assertEquals(expectedResult, solution.fastPower(a, b, n));

        a = 1;
        b = 2147483647;
        n = 2147483647;
        expectedResult = 1;
        assertEquals(expectedResult, solution.fastPower(a, b, n));

        a = 31;
        b = 1;
        n = 0;
        expectedResult = 0;
        assertEquals(expectedResult, solution.fastPower(a, b, n));

        a = 109;
        b = 10000007;
        n = 1000001;
        expectedResult = 5249911;
        assertEquals(expectedResult, solution.fastPower(a, b, n));

        a = 27123;
        b = 5201314;
        n = 78965412;
        expectedResult = 842799;
        assertEquals(expectedResult, solution.fastPower(a, b, n));
    }
}