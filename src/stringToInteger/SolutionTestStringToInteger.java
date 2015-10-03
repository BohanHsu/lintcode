package stringToInteger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/3/15.
 */
public class SolutionTestStringToInteger {
    @Test
    public void testAtoi() {
        String str = null;
        int expectedResult = 0;
        int result = 0;
        Solution solution = new Solution();

        str = "10";
        expectedResult = 10;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "-1";
        expectedResult = -1;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "123123123123123";
        expectedResult = 2147483647;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "1.0";
        expectedResult = 1;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "00000";
        expectedResult = 0;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = Integer.MAX_VALUE + "";
        expectedResult = Integer.MAX_VALUE;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = Integer.MIN_VALUE + "";
        expectedResult = Integer.MIN_VALUE;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);
    }

    @Test
    public void onlineFailed() {
        String str = null;
        int expectedResult = 0;
        int result = 0;
        Solution solution = new Solution();

        str = "    k";
        expectedResult = 0;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "    52lintcode   ";
        expectedResult = 52;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "  +-1111  ";
        expectedResult = 0;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "  15+4  "; // what the f**k, what's your d**n rule????
        expectedResult = 15;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "+1";
        expectedResult = 1;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);

        str = "        112469032d53";
        expectedResult = 112469032;
        result = solution.atoi(str);
        assertEquals(expectedResult, result);
    }
}