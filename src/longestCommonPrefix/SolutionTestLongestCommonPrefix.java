package longestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/3/15.
 */
public class SolutionTestLongestCommonPrefix {
    @Test
    public void testLongestCommonPrefix() {
        Solution solution = new Solution();

        String[] strs = {"ABCD", "ABEF", "ACEF"};
        String expectedResult = "A";
        String result = solution.longestCommonPrefix(strs);
        assertEquals(expectedResult, result);

        strs = new String[]{"ABCDEFG", "ABCEFG", "ABCEFA"};
        expectedResult = "ABC";
        result = solution.longestCommonPrefix(strs);
        assertEquals(expectedResult, result);

        strs = new String[]{"ABCDEFG", ""};
        expectedResult = "";
        result = solution.longestCommonPrefix(strs);
        assertEquals(expectedResult, result);

        strs = new String[]{"ABCDEFG", "ABCDEFG"};
        expectedResult = "ABCDEFG";
        result = solution.longestCommonPrefix(strs);
        assertEquals(expectedResult, result);
    }

    @Test
    public void onlineFailed() {
        Solution solution = new Solution();

        String[] strs = {};
        String expectedResult = "";
        String result = solution.longestCommonPrefix(strs);
        assertEquals(expectedResult, result);
    }
}