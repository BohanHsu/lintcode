package longestCommonSubstring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 9/28/15.
 */
public class SolutionTestLongestComonSubstring {
    @Test
    public void testLongestCommonSubstring() {
        Solution solution = new Solution();
        String a = "ABCD";
        String b = "CBCE";
        int expectedResult = 2;
        int actualResult = solution.longestCommonSubstring(a, b);
        assertEquals(expectedResult, actualResult);

        a = "aaaaabcd";
        b = "aaaaebc";
        expectedResult = 4;
        actualResult = solution.longestCommonSubstring(a, b);
        assertEquals(expectedResult, actualResult);

        a = "";
        b = "";
        expectedResult = 0;
        actualResult = solution.longestCommonSubstring(a, b);
        assertEquals(expectedResult, actualResult);

        a = "headsfkjl";
        b = "";
        expectedResult = 0;
        actualResult = solution.longestCommonSubstring(a, b);
        assertEquals(expectedResult, actualResult);
    }
}